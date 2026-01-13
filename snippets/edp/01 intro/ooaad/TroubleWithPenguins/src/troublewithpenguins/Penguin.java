package troublewithpenguins;

/**
 *
 * @author Andrei Toma
 */
public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
        this.howToSwim = new RegularSwimming();
        this.howToFly = new NoFlying();

    }
}
