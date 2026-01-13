package ro.andrei.domain;

/**
 * Created by null on 11/7/16.
 */
public class SimpleInvoker  implements Invoker{
    private Command command;

    @Override
    public void run() {
        command.execute();
    }

    @Override
    public void undo() {
        command.undo();
    }

    @Override
    public void setCommand(Command command) {
        this.command = command;
    }
}
