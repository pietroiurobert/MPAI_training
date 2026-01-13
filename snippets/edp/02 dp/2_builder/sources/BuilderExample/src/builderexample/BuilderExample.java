/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builderexample;

import builderexample.domain.Bread;
import builderexample.domain.Onions;
import builderexample.domain.Sandwitch;

/**
 *
 * @author null
 */
public class BuilderExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sandwitch s = new Sandwitch.SandwitchBuilder(Bread.PANINO,"chicken").cheese("cream cheese").build();
        Sandwitch s1 = new Sandwitch.SandwitchBuilder(Bread.TOAST,"chicken").onions(Onions.FEW).build();
    }
}
