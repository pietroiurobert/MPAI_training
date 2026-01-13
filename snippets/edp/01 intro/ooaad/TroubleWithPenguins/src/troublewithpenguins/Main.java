package troublewithpenguins;

/**
 *
 * @author Andrei Toma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Penguin p1 = new Penguin("somepenguin");
        Duck d1 = new Duck("duck");
        DaringPenguin penguin = new DaringPenguin("hero");
        p1.fly(10);
        d1.fly(20);
        penguin.fly(500);
    }

}
