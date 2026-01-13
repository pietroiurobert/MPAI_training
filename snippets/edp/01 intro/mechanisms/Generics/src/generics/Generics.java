/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generics;

import generics.domain.Duckling;
import generics.domain.Eagle;
import generics.domain.Nest;

/**
 *
 * @author null
 */
public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Duckling smallDuck = new Duckling("small duck");
        Nest<Duckling> nest = new Nest<>();
        nest.addContent(smallDuck);
        Duckling copyDuck = nest.getContent();
        copyDuck.wobble();
        
        Eagle eagle = new Eagle("eagle"); 
        Nest<Eagle> eagleNest = new Nest<>();
        eagleNest.addContent(eagle);
        Eagle copyEagle = eagleNest.getContent();
        copyEagle.soar();
    }
    
}
