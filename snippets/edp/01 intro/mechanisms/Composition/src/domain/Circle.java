/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 *
 * @author null
 */
public class Circle implements Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    
    @Override
    public int getArea() {
       return (int) (getRadius()*getRadius()*Math.PI);
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
