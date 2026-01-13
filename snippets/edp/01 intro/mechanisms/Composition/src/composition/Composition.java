/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package composition;

import domain.Circle;
import domain.Square;
import domain.Surface;

/**
 *
 * @author null
 */
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Surface s = new Surface();
        s.addShape(new Circle(3));
        s.addShape(new Square(4));
        System.out.println(s.getCoveredArea());
    }
    
}
