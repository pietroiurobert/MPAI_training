/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplenullobject.domain;

/**
 *
 * @author null
 */
public class Device {
    private String name;

    public Device(String name) {
        this.name = name;
    }
    
    public void use(){
        System.out.println("using -> " + name);
    }
}
