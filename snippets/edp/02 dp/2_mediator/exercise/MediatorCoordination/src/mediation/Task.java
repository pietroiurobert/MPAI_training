/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediation;

import java.util.Random;

/**
 *
 * @author null
 */
public class Task extends Colleague {

    private String name;
    
    public Task(Mediator m) {
        super(m);
    }

    @Override
    public void go(Message message) {
        System.out.println(name + " executing task. Current iteration: " + message.getIteration());
        message.setState("done");
        mediator.handle(message);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
