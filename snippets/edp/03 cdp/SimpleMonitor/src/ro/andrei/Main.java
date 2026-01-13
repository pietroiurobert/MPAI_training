package ro.andrei;

import ro.andrei.domain.BoundList;
import ro.andrei.domain.IntegerConsumerTask;
import ro.andrei.domain.IntegerProducerTask;

public class Main {

    public static void main(String[] args) {
        BoundList list = new BoundList(5);
        IntegerProducerTask producer = new IntegerProducerTask(list);
        IntegerConsumerTask consumer = new IntegerConsumerTask(list);
        new Thread(producer).start();
        new Thread(consumer).start();

    }
}
