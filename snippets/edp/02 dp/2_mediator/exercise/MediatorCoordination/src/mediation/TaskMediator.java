/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author null
 */
public class TaskMediator implements Mediator {

    private List<Task> tasks = new ArrayList<>();
    static int currentIteration = 0;

    @Override
    public void handle(Message message) {
        cedeControl(selectTask());
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }
    
    private Task selectTask(){
        Random r = new Random();
        int index = r.nextInt(tasks.size());
        return tasks.get(index);
    }
    
    private void cedeControl(Task task){
        currentIteration++;
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(TaskMediator.class.getName()).log(Level.SEVERE, null, ex);
        }
        task.go(new Message("go", currentIteration));
    }
    
    public void entryPoint(){
        cedeControl(selectTask());
    }
}
