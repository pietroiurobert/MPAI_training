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
public class Square implements Shape{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    /**
     * @return the side
     */
    public int getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(int side) {
        this.side = side;
    }
    
}
