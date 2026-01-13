/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorcoordination;

import mediation.Task;
import mediation.TaskMediator;

/**
 *
 * @author null
 */
public class MediatorCoordination {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TaskMediator mediator = new TaskMediator();
        for (int i = 0; i < 10; i++) {
            Task t = new Task(mediator);
            t.setName("task" + i);
            mediator.addTask(t);
        }
        mediator.entryPoint();
    }
}
