/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

/**
 *
 * @author null
 */
public class StopCommand implements Command {

    private Receiver receiver;

    public StopCommand(Receiver r) {
        this.receiver = r;
    }

    @Override
    public void execute() {
        receiver.stop();
        System.out.println();
    }
 
}
