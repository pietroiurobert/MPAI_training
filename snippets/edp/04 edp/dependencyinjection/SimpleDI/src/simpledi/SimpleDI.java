/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledi;

import di.injectors.PropertyInjector;
import di.scanners.PathScanner;
import java.lang.reflect.InvocationTargetException;
import simpledi.domain.GenericBox;

/**
 *
 * @author null
 */
public class SimpleDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, InstantiationException {
        PathScanner.addBeansToRepository(SimpleDI.class.getPackage());
        GenericBox<Object> box = new GenericBox<>();        
        PropertyInjector.inject(box);
        box.printContent();
    }
}
