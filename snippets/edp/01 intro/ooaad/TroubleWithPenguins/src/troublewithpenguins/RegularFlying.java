package troublewithpenguins;

/**
 *
 * @author Andrei Toma
 */
public class RegularFlying implements FlyingBehavior{

    public void fly(int distance) {
        System.out.println("Flew " + distance + "meters");
    }

}
