package ro.andrei.domain;

public class RestartCommand implements Command {
    private Receiver receiver;

    public RestartCommand(Receiver receiver){
        this.receiver = receiver;
    }


    @Override
    public void execute() {
        receiver.connect();
        receiver.restart();
        receiver.disconnect();
        System.out.println();
    }

    @Override
    public void undo(){
        System.out.println("Undoing...");
        receiver.connect();
        receiver.shutdown();
        receiver.disconnect();
        System.out.println();
    }
}
