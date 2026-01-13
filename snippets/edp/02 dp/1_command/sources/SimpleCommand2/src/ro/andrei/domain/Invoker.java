package ro.andrei.domain;


public interface Invoker {
    public void run();
    public void undo();
    public void setCommand(Command c);
}
