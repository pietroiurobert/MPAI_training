/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specloading.domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author null
 */
public class SimpleDisplayableLoader {
    
    public static Object loadDisplayable(String spec) throws FileNotFoundException, IOException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
        Properties props = new Properties();
        FileInputStream in = new FileInputStream(spec + ".properties");
        props.load(in);
        in.close();
        String className = props.getProperty("CLASS");
        Class clazz = Class.forName(className);
        String constructorSpec = props.getProperty("CONSTRUCTOR");
        String[] targetedConstructorTypes = constructorSpec.split(",");
        List<Class> paramClasses = new ArrayList<>();
        for (String item : targetedConstructorTypes) {
            Class paramClass = Class.forName(item);
            paramClasses.add(paramClass);
        }
        Constructor constructor = clazz.getConstructor(paramClasses.toArray(new Class[paramClasses.size()]));
        String paramsSpec = props.getProperty("PARAMS");
        String[] paramItemList = paramsSpec.split(",");
        List<Object> paramList = new ArrayList<>();
        for (int i = 0; i < paramItemList.length; i++) {
            String paramString = paramItemList[i];
//            Object actualParam = paramClasses.get(i).cast(paramString);
//            System.out.println(paramClasses.get(i).toString());
            if (paramClasses.get(i).isInstance(new String())) {
                paramList.add(paramString);
            } else {
                paramList.add(Integer.valueOf(paramString));
            }
//            paramList.add(actualParam);
        }
        Object obj = constructor.newInstance(paramList.toArray(new Object[paramList.size()]));
        String postloadSpec = props.getProperty("POSTLOAD");
        String[] postloadItems = postloadSpec.split("->");
        String fieldName = postloadItems[0];
        String fieldValue = postloadItems[1];
        Field f = clazz.getDeclaredField(fieldName);
        Class fieldType = f.getType();
        Class[] fields = {fieldType};
        Method setter = clazz.getMethod("set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1, fieldName.length()), fields);
        setter.invoke(obj, fieldValue);
        return obj;
    }
}
