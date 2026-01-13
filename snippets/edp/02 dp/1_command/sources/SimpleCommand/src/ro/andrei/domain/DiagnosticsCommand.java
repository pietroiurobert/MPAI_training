package ro.andrei.domain;

/**
 * Created by null on 11/7/16.
 */
public class DiagnosticsCommand implements Command{

    private Receiver receiver;

    public DiagnosticsCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.diagnostics();
        receiver.disconnect();
    }
}
