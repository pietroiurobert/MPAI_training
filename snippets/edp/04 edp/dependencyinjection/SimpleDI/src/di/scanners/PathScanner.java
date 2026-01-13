/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package di.scanners;

import di.annotations.Manageable;
import di.repositories.LocalBeanRepository;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;

/**
 *
 * @author null
 */
public class PathScanner {
    
    public static void addBeansToRepository(Package pkg) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String pkgname = pkg.getName();
        String relPath = pkgname.replace('.', '/');
        URL resource = ClassLoader.getSystemClassLoader().getResource(relPath);
        if (resource == null) {
            throw new RuntimeException("Unexpected problem: No resource for " + relPath);
        }
        //System.out.println("Package: '" + pkgname + "' becomes Resource: '" + resource.toString() + "'");
        
        resource.getPath();
        
        processDirectory(new File(resource.getPath()), pkgname);
        
        
    }
    
    private static void processDirectory(File directory, String pkgname) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        
        String[] files = directory.list();
        for (int i = 0; i < files.length; i++) {
            String fileName = files[i];
            String className = null;
            if (fileName.endsWith(".class")) {
                className = pkgname + '.' + fileName.substring(0, fileName.length() - 6);
            }
           // System.out.println("FileName '" + fileName + "'  =>  class '" + className + "'");
            if (className != null) {
                //classes.add(Class.forName(className));
                Class clazz = Class.forName(className);
                if (clazz.isAnnotationPresent(Manageable.class)) {
                    Manageable anno = (Manageable) clazz.getAnnotation(Manageable.class);
                    String key = anno.repositoryKey();
                    System.out.println("adding " + className);
                    Constructor constructor = clazz.getConstructor(String.class);
                    LocalBeanRepository.registerObject(key, constructor.newInstance(key));
                }
            }
            File subdir = new File(directory, fileName);
            if (subdir.isDirectory()) {
                processDirectory(subdir, pkgname + '.' + fileName);
            }
        }
    }
}
