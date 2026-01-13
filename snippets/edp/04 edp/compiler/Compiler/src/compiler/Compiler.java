/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import compiler.runner.InjectableRunner;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author null
 */
public class Compiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//        System.out.println(new File(".").getAbsolutePath());
        String dirPath = new File(".").getAbsolutePath();
        dirPath = dirPath.substring(0, dirPath.length() - 1);
        System.out.println(dirPath);
        String codePath = dirPath + "src\\compiler\\codelet\\SimpleInjectable.java";
        InjectableRunner runner = new InjectableRunner();
        File[] files = new File[1];
        files[0] = new File(codePath);
        runner.run(files, "compiler.codelet.SimpleInjectable", "run");
    }

}
