/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.runner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

/**
 *
 * @author null
 */
public class InjectableRunner {


    public void run(File[] codeFiles, String entryClass, String entryMethod) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        Iterable<? extends JavaFileObject> compilationUnits1
                = fileManager.getJavaFileObjectsFromFiles(Arrays.asList(codeFiles));
        compiler.getTask(null, fileManager, null, null, null, compilationUnits1).call();
        Class<?> clazz = Class.forName(entryClass);
        Method m = clazz.getMethod(entryMethod);
        String result = (String)m.invoke(null, null);
        System.out.println(result);

    }

   
}
