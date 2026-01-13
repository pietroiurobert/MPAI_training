/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package troublewithpenguins;

/**
 *
 * @author Andrei Toma
 */
public class DaringPenguin extends Penguin{
    public DaringPenguin(String name){
        super(name);
        this.howToFly = new FlyByRocket();
    }
}
