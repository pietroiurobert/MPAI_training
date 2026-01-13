package ro.andrei.domain;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;


public class BoundList {
    private List<Integer> content = new ArrayList<>();
    private Lock lock = new ReentrantLock();
    private int capacity;
    private Condition isNotFull = lock.newCondition();
    private Condition isNotEmpty = lock.newCondition();

    public BoundList(int capacity){
        this.capacity = capacity;
    }

    public void put(Integer item) throws InterruptedException{
        lock.lock();
        try {
            while (content.size() == capacity) {
                isNotFull.await();
            }
            content.add(item);
            System.err.println("added : " + item);
            isNotEmpty.signal();
        }
        finally {
            lock.unlock();
        }

    }

    public Integer get() throws InterruptedException{
        lock.lock();
        try {
            while (content.isEmpty()){
                isNotEmpty.await();
            }
            Integer item = content.get(content.size() -1);
            content.remove(item);
            isNotFull.signal();
            return item;
        }
        finally {
            lock.unlock();
        }
    }
}
