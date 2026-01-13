/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.ep1.factory;

import patterns.ep1.factory.shapes.Shape;

/**
 *
 * @author null
 */
public class FactoryExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape square = ShapeFactory.getShape(ShapeType.SQUARE);
		square.setX(4);
		System.out.println(square.getArea());
		Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
		circle.setX(4);
		System.out.println(circle.getArea());
    }
    
}
