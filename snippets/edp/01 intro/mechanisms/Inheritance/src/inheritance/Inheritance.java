/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;

import inheritance.domain.Car;
import inheritance.domain.RaceCar;

/**
 *
 * @author null
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car c = new Car("some manufacturer", 2000, 150);
        RaceCar r = new RaceCar("some other manufacturer", 2000, 300);
        c.run();
        r.run();
        r.race();
    }
    
}
