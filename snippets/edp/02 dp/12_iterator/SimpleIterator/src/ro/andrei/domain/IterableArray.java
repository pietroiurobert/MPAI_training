package ro.andrei.domain;

public class IterableArray implements CustomIterable{

    private  int[] values;

    public IterableArray(){
        this.values = new int[10];
        for (int i = 0; i < this.values.length; i++) {
            values[i] = i;
        }
    }

    @Override
    public CustomIterator getIterator() {
        return new VectorIterator(this.values);
    }
}
