/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package di.injectors;

import di.annotations.Injectable;
import di.repositories.LocalBeanRepository;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author null
 */
public class PropertyInjector {

    public static void inject(Object object) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class clazz = object.getClass();
        System.out.println("Loading " + clazz.getCanonicalName());
        List<Field> managed = getManagedFields(clazz, Injectable.class);
        for (Field field : managed) {
            String fieldName = field.getName();
            String setterName = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
            String key = field.getAnnotation(Injectable.class).repositoryKey();
            Object value = findValueToInject(key);
            Method setterMethod = clazz.getMethod(setterName, field.getType());
            setterMethod.invoke(object, value);
        }
    }

    public static List<Field> getManagedFields(Class clazz, Class annotation) {
        List<Field> results = new ArrayList<>();
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println("Field: " + field.getName());
            if (field.isAnnotationPresent(Injectable.class)) {
                System.out.println("is annotated");
                results.add(field);
            }
        }
        return results;
    }

    private static Object findValueToInject(String key) {
        Object value = LocalBeanRepository.getObject(key);
        return value;
    }
}
