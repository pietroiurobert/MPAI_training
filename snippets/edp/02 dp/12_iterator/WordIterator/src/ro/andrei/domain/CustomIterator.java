package ro.andrei.domain;

public interface CustomIterator {
    public boolean hasNext();
    public boolean hasPrevious();
    public Object next();
    public Object previous();
    public void start();
    public void end();
}
