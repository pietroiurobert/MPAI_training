/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

/**
 *
 * @author null
 */
public class GoCommand implements Command {

    private Receiver receiver;

    public GoCommand(Receiver r) {
        this.receiver = r;
    }

    @Override
    public void execute() {
        receiver.start();
        receiver.forward();
        System.out.println();
    }

    
}
