/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance.domain;

/**
 *
 * @author null
 */
public class RaceCar extends Car{

    public RaceCar(String make, int weight, int speed) {
        super(make, weight, speed);
    }
   
    public void race(){
        System.out.println("car is racing at " + getSpeed() + "km/h");
    }
    
     public void run(){
        System.out.println("car is running at " + getSpeed()/2 + "km/h");
    }
}
