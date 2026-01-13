/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author null
 */
public class Message {
    private String state;
    private int ammount;

    public Message(String state, int ammount) {
        this.state = state;
        this.ammount = ammount;
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
     * @return the ammount
     */
    public int getAmmount() {
        return ammount;
    }

    /**
     * @param ammount the ammount to set
     */
    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }
    
}
