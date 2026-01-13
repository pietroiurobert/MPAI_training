/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediation;

/**
 *
 * @author null
 */
public class Message {
    private String state;
    private int currentIteration;

    public Message(String state, int ammount) {
        this.state = state;
        this.currentIteration = ammount;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the currentIteration
     */
    public int getIteration() {
        return currentIteration;
    }

    /**
     * @param currentIteration the currentIteration to set
     */
    public void setIteration(int ammount) {
        this.currentIteration = ammount;
    }
    
}
