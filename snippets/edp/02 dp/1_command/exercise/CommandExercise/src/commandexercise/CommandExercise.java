/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandexercise;

import commands.Command;
import commands.DefectiveRobot;
import commands.GoCommand;
import commands.Invoker;
import commands.Receiver;
import commands.Robot;
import commands.SimpleInvoker;
import commands.StopCommand;

/**
 *
 * @author null
 */
public class CommandExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Receiver robotMK1 = new Robot();
        Receiver robotMK2 = new DefectiveRobot();
        Command start1 = new GoCommand(robotMK1);
        Command start2 = new GoCommand(robotMK2);
        Command stop1 = new StopCommand(robotMK1);
        Command stop2 = new StopCommand(robotMK2);
        
        System.out.println("Testing the robots");
        System.out.println();

        Invoker invoker = new SimpleInvoker();
        invoker.setCommand(start1);
        invoker.run();
        invoker.setCommand(start2);
        invoker.run();
        invoker.setCommand(stop2);
        invoker.run();

    }
}
