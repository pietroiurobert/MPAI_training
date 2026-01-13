/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplenullobject;

import simplenullobject.domain.AbstractRobot;
import simplenullobject.domain.Device;
import simplenullobject.domain.NullRobot;
import simplenullobject.domain.RandomRobot;

/**
 *
 * @author null
 */
public class SimpleNullObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractRobot r = new RandomRobot();
        r.addDevice(new Device("engine"));
        r.addDevice(new Device("sensors"));
        r.useAll();
        AbstractRobot r1 = new NullRobot();
        r1.addDevice(new Device("engine"));
        r1.addDevice(new Device("sensors"));
        r1.useAll();
    }
    
}
