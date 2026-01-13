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
public abstract class AbstractPizza {
    String name;
    Double price;
    
    public abstract String getIngredients();
}
