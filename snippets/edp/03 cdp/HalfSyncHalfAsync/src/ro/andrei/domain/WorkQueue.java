package ro.andrei.domain;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by null on 11/4/16.
 */
public class WorkQueue {
    private BlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>();

    public void enqueue(AsyncTask task){
        taskQueue.add(task);
    }

    public WorkQueue(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (taskQueue.isEmpty());
                ExecutorService executorService = Executors.newFixedThreadPool(10);
                try{
                    while (true){
                        executorService.submit((Runnable) taskQueue.take());
                    }
                }
                catch (InterruptedException ex){
                    System.out.println("Task execution failed");
                }
                finally {
                    executorService.shutdown();
                }
            }
        }).start();
    }
}
