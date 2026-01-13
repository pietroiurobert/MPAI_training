package ro.andrei.domain;

/**
 * Created by null on 11/7/16.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void run(){
        command.execute();
    }
}
