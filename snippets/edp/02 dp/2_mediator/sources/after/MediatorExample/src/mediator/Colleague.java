/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author null
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator m) {
        mediator = m;
    }

    //send a message via the mediator
    public abstract void go(Message amount);

    //get access to the mediator
    public Mediator getMediator() {
        return mediator;
    }

}
