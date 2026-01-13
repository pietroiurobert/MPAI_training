/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

/**
 *
 * @author null
 */
public class SimpleInvoker implements Invoker{

    Command command;

    public void setCommand(Command c) {
        command = c;
    }

    public void run() {
        command.execute();
    }

    
}
