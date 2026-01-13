/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorlive;

import decoratorlive.domain.ExoticPizza;
import decoratorlive.domain.PaesanoPizza;
import decoratorlive.domain.SimplePizza;

/**
 *
 * @author null
 */
public class DecoratorLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimplePizza simplePizza = new SimplePizza("simple", 10.0);
        System.out.println(simplePizza.getIngredients());
        ExoticPizza exoticPizza = new ExoticPizza(simplePizza);
        System.out.println(exoticPizza.getIngredients());
        PaesanoPizza paesanoPizza = new PaesanoPizza(exoticPizza);
        System.out.println(paesanoPizza.getIngredients());
    }
    
}
