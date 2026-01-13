/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplenullobject.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author null
 */
public abstract class AbstractRobot {
    protected List<Device> devices = new ArrayList<>();

    public abstract void useAll();
    
    public void addDevice(Device d){
        devices.add(d);
    }
    
}
