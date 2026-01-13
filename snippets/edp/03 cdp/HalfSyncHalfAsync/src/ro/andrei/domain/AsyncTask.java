package ro.andrei.domain;

/**
 * Created by null on 11/4/16.
 */
public class AsyncTask extends AbstractTask implements Runnable{
    public AsyncTask(Responder responder, String name){
        super(TaskType.LONG, responder, name);
    }

    @Override
    public void run() {
        System.out.println("running async task : " + name);
        responder.notify("finished :" + name);
    }
}
