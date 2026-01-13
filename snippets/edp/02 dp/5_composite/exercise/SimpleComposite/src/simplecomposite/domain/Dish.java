/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecomposite.domain;

/**
 *
 * @author null
 */
public class Dish implements MenuComponent{

    private String name;
    private Double price;

    public Dish(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public void show() {
        System.out.println("dish " + name + " price " + price);
    }
    
}
