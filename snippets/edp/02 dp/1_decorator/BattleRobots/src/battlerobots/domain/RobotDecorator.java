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
public abstract class RobotDecorator extends AbstractRobot{
    protected final AbstractRobot decoratedRobot;

    public RobotDecorator(AbstractRobot robot) {
        this.decoratedRobot = robot;
    }

    @Override
    public String fight() {
        return "fights with " + printComponents();
    }

    @Override
    public String printComponents() {
        String result = "components" + Arrays.toString(components.toArray()) + " " +decoratedRobot.printComponents();
        return result;
    }

  
}