/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorlive.domain;

/**
 *
 * @author null
 */
public class SimplePizza extends AbstractPizza{

    public SimplePizza(String name,Double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String getIngredients() {
        return "simple, with cheese and tomatoes";
    }
    
}
