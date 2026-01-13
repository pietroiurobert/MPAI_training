/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlerobots.domain;

import java.util.Arrays;

/**
 *
 * @author null
 */
public class SimpleRobot extends AbstractRobot{
    
    
    public SimpleRobot(String engine, String chasis) {
        this.components.add(engine);
        this.components.add(chasis);
    }


    @Override
    public String fight() {
      
        return "fights with " + printComponents();
    }

    @Override
    public String printComponents() {
        return "components" + Arrays.toString(components.toArray());
    }
}

