package ro.andrei.domain;

/**
 * Created by null on 11/7/16.
 */
public class ApplicationServer implements Receiver {
    @Override
    public void connect() {
        System.out.println("Connected to the application server");
    }

    @Override
    public void diagnostics() {
        System.out.println("Running diagnostics on the application server");
    }

    @Override
    public void restart() {
        System.out.println("Restarting the application server");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting the application server down");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from the application server");
    }
}
