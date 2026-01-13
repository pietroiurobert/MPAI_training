package ro.andrei.domain;

/**
 * Created by null on 11/4/16.
 */
public class SyncTask extends AbstractTask{
    public SyncTask(Responder responder, String name){
        super(TaskType.SHORT, responder, name);
    }

    public void doTask(){
        System.out.println("finished sync task : " + name);
    }
}
