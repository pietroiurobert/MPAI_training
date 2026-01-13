package ro.andrei.domain;

/**
 * Created by null on 11/4/16.
 */
public class Dispatcher {
    private WorkQueue workQueue = new WorkQueue();

    public void doTask(AbstractTask task){
        if (task.type == TaskType.SHORT){
            ((SyncTask)task).doTask();
        }
        else{
            workQueue.enqueue((AsyncTask) task);
        }
    }
}
