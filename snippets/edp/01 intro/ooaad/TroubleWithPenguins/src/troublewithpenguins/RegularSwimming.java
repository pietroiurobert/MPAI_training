package troublewithpenguins;

/**
 *
 * @author Andrei Toma
 */
public class RegularSwimming implements SwimmingBehavior{
    public void swim(int distance){
        System.out.println("Swam " + distance + "meters");
    }
}
