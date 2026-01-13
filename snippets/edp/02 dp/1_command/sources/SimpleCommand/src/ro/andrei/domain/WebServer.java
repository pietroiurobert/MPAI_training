package ro.andrei.domain;

/**
 * Created by null on 11/7/16.
 */
public class WebServer implements Receiver{
    @Override
    public void connect() {
        System.out.println("Connected to the web server");
    }

    @Override
    public void diagnostics() {
        System.out.println("Running diagnostics on the web server");
    }

    @Override
    public void restart() {
        System.out.println("Restarting the web server");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting the web server down");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from the web server");
    }
}
