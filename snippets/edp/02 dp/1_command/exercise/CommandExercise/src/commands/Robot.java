/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

/**
 *
 * @author null
 */
public class Robot implements Receiver{
    
    @Override
    public void forward() {
        System.out.println("Moving forward");
    }

    @Override
    public void stop() {
        System.out.println("Robot stopped");
    }

    @Override
    public void start() {
        System.out.println("Robot started");
    }
}
