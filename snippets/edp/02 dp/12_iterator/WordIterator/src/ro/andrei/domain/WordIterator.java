package ro.andrei.domain;

/**
 * Created by null on 10/31/16.
 */
public class WordIterator implements CustomIterator{

    private String[] parts;
    private int position;

    public WordIterator(String[] parts){
        this.parts = parts;
        this.position = -1;
    }

    @Override
    public boolean hasPrevious() {
        return (position - 1 >= 0);
    }

    @Override
    public boolean hasNext() {
        return (position + 1 < parts.length);
    }

    @Override
    public Object next() {
        position++;
        return parts[position];
    }

    @Override
    public Object previous() {
        position--;
        return parts[position];
    }

    @Override
    public void start() {
        position = -1;
    }

    @Override
    public void end() {
        position = parts.length;
    }
}
