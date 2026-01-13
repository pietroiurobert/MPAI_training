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
public class PaesanoPizza extends PizzaDecorator{
    
    public PaesanoPizza(AbstractPizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", bacon, corn"; 
    }
    
}
