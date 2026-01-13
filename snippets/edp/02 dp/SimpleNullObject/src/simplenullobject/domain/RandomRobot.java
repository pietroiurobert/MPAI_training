/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplenullobject.domain;

import java.util.Random;

/**
 *
 * @author null
 */
public class RandomRobot extends AbstractRobot{

    
    
    @Override
    public void useAll() {
        Random r = new Random();
        int bound = devices.size();
        for (Device device : devices) {
            devices.get(r.nextInt(bound)).use();
        }
        
    }
    
}
