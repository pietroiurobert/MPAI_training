package troublewithpenguins;

/**
 *
 * @author Andrei Toma
 */
public class Duck extends Bird{

    public Duck(String name) {
        super(name);
        this.howToSwim = new RegularSwimming();
        this.howToFly = new RegularFlying();
    }

}
