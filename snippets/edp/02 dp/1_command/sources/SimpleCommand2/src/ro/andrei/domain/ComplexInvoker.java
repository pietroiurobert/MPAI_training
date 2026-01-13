package ro.andrei.domain;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by null on 11/7/16.
 */
public class ComplexInvoker implements Invoker{

    private Queue<Command> commands = new LinkedList<>();

    @Override
    public void run() {
        Command currentCommand = commands.peek();
        currentCommand.execute();
    }

    public void runAll(){
        for (Command command: commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        Command lastCommand = commands.poll();
        lastCommand.undo();
    }

    @Override
    public void setCommand(Command command) {
        commands.add(command);
    }
}
