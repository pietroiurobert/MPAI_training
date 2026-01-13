package ro.andrei.domain;

/**
 * Created by null on 11/7/16.
 */
public interface Receiver {
    public void connect();
    public void diagnostics();
    public void restart();
    public void shutdown();
    public void disconnect();
}
