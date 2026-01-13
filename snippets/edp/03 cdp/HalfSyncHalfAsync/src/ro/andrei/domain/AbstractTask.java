package ro.andrei.domain;

/**
 * Created by null on 11/4/16.
 */
public class AbstractTask {
    protected TaskType type;
    protected String name;
    protected Responder responder;

    public AbstractTask(TaskType type, Responder responder, String name){
        this.type = type;
        this.responder = responder;
        this.name = name;
    }
}
