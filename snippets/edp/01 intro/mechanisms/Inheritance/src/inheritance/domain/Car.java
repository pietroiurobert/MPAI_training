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
public class Car {
    private String make;
    private int weight;
    private int speed;

    public Car(String make, int weight, int speed) {
        this.make = make;
        this.weight = weight;
        this.speed = speed;
    }
    
    
    public void run(){
        System.out.println("car is running at " + speed + "km/h");
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
