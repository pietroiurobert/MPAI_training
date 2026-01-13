/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author null
 */
public class Surface {
    private List<Shape> shapes;

    public Surface() {
        shapes = new ArrayList<>();
    }
    
    public void addShape(Shape s){
        shapes.add(s);
    }
    
    public int getCoveredArea(){
        int sum = 0;
        for (Shape shape : shapes) {
            sum+=shape.getArea();
        }
        return sum;
    }
}
