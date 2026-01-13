/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractmapfactory;

import abstractmapfactory.domain.MapBuilder;
import abstractmapfactory.domain.MountainFactory;
import abstractmapfactory.domain.PlainsFactory;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author null
 */
public class AbstractMapFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MapBuilder builder = new MapBuilder();
       MountainFactory mf = new MountainFactory();
       PlainsFactory pf = new PlainsFactory();
       BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("map.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AbstractMapFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        String line = null;
       for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
               try {
                   line=reader.readLine();
               } catch (IOException ex) {
                   Logger.getLogger(AbstractMapFactory.class.getName()).log(Level.SEVERE, null, ex);
               }
                if (line.trim().equals("m"))
                    builder.buildMap(mf);        
                else
                   builder.buildMap(pf);
                
            }
             System.out.println();
        }
    }
}
