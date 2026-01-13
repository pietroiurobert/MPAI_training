/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractmapfactory.domain;

import java.util.Random;

/**
 *
 * @author null
 */
public class MapBuilder {
    public void buildMap(AbstractSquareFactory factory){
        MapSquare square = factory.build();
        System.out.print(square.draw());
    }
}
