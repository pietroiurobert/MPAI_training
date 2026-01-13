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
public class PizzaDecorator extends AbstractPizza{

    protected final AbstractPizza piza;

    public PizzaDecorator(AbstractPizza piza) {
        this.piza = piza;
    }
    
    @Override
    public String getIngredients() {
        return piza.getIngredients();
    }
    
}
