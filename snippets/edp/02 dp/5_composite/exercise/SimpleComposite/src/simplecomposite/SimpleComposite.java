/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecomposite;

import simplecomposite.domain.Dish;
import simplecomposite.domain.MenuComponent;
import simplecomposite.domain.MenuSection;

/**
 *
 * @author null
 */
public class SimpleComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuSection veganMenu = new MenuSection();
        MenuComponent dish1 = new Dish("simple salad", 5.0);
        MenuComponent dish2 = new Dish("houmous", 4.0);
        veganMenu.add(dish1);
        veganMenu.add(dish2);
        MenuComponent dish3 = new Dish("milk", 2.0);
        MenuSection vegetarianMenu = new MenuSection();
        vegetarianMenu.add(veganMenu);
        vegetarianMenu.add(dish3);
        MenuSection fullMenu = new MenuSection();
        fullMenu.add(vegetarianMenu);
        MenuComponent dish4 = new Dish("steak", 9.0);
        fullMenu.add(dish4);
        fullMenu.show();
    }
    
}
