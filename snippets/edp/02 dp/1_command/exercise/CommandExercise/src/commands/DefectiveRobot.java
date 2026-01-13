/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

/**
 *
 * @author null
 */
public class DefectiveRobot implements Receiver{
    
    @Override
    public void forward() {
        System.out.println("Attempting to kill all humans");
    }

    @Override
    public void stop() {
        System.out.println("Robot stopped from mission control");
    }

    @Override
    public void start() {
        System.out.println("Robot started");
    }
}
