package ro.andrei.domain;

import java.util.Random;

public class IntegerProducerTask implements Runnable{

    private BoundList list;

    public IntegerProducerTask(BoundList list){
        this.list = list;
    }

    @Override
    public void run() {
        Integer limit = 100;
        Integer value = 0;
        Random r = new Random();
        while (limit > 0){
            limit--;
            value++;
            try {
                list.put(value);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
        }
    }
}
