package troublewithpenguins;

/**
 *
 * @author Andrei Toma
 */
abstract public class Bird implements FlyingBehavior,SwimmingBehavior{
    private String name;
    protected  SwimmingBehavior howToSwim;
    protected  FlyingBehavior howToFly;

    public Bird() {
    }

    public Bird(String name) {
        this.name = name;
    }

    public void swim(int distance){
        this.howToSwim.swim(distance);
    }
    public void fly(int distance){
        this.howToFly.fly(distance);
    }

}
