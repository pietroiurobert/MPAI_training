/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.javadb.managers;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistence.javadb.annotations.PersistentAttribute;
import persistence.javadb.annotations.PersistentEntity;
import persistence.javadb.annotations.exceptions.PersistenceException;
import persistence.javadb.types.AttributeTypes;

/**
 *
 * @author null
 */
public class SimpleEntityManager {

    private SimpleEntityManager() {
    }
    private static SimpleEntityManager instance;

    public static SimpleEntityManager getInstance() {
        if (instance == null) {
            instance = new SimpleEntityManager();
        }
        return instance;
    }

//    private saveToDatabase(){
//    
//    }
    public static void persist(Object object) throws PersistenceException {
        Class clazz = object.getClass();
        StringBuilder query = new StringBuilder("insert into ");
        PersistentEntity classAnnotation = (PersistentEntity) clazz.getAnnotation(PersistentEntity.class);
        if (classAnnotation == null) {
            throw new PersistenceException("Object is not a valid entity");
        }
        System.out.println("Persisting " + clazz.getCanonicalName());
        query.append(classAnnotation.name());
        List<String> names = new ArrayList<>();
        List<String> values = new ArrayList<>();
        List<Field> managed = getManagedFields(clazz, PersistentAttribute.class);
        for (Field field : managed) {
            String name = field.getAnnotation(PersistentAttribute.class).name();
            String value = "";
            if (name.isEmpty()) {
                name = field.getName();
            }
            names.add(name);
            try {
                value = field.get(object).toString();
                if (field.getAnnotation(PersistentAttribute.class).type() == AttributeTypes.VARCHAR)
                    value = "'" + value + "'";
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(SimpleEntityManager.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(SimpleEntityManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            values.add(value);
        }
        query.append("(").append(join(names,",")).append(")").append(" values ").append(join(values,","));
        System.out.println(query);
    }

    private static String join(Collection<String> strings, String separator) {
        Iterator<String> iter = strings.iterator();
        StringBuilder sb = new StringBuilder();
        if (iter.hasNext()) {
            sb.append(iter.next());
            while (iter.hasNext()) {
                sb.append(separator).append(iter.next());
            }
        }
        String joined = sb.toString();
        return joined;
    }

    private static List<Field> getManagedFields(Class clazz, Class annotation) {
        List<Field> results = new ArrayList<>();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(PersistentAttribute.class)) {
                results.add(field);
            }
        }
        return results;
    }
}
