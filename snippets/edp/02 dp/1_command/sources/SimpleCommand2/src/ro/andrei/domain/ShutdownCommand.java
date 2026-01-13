package ro.andrei.domain;

public class ShutdownCommand implements Command {

    private Receiver receiver;

    public ShutdownCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.shutdown();
        receiver.disconnect();
    }

    @Override
    public void undo(){
        System.out.println("Undoing...");
        receiver.connect();
        receiver.restart();
        receiver.disconnect();
        System.out.println();
    }
}
