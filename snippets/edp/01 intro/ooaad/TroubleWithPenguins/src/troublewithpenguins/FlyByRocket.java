/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package troublewithpenguins;

/**
 *
 * @author Andrei Toma
 */
public class FlyByRocket implements FlyingBehavior{

    public void fly(int distance) {
        System.out.println("Rocketed away for " + distance + " meters");
    }

}
