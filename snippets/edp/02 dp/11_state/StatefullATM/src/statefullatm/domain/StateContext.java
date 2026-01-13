/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statefullatm.domain;

/**
 *
 * @author null
 */
public class StateContext {
    private ATMState currentState;

    public StateContext() {
        this.currentState = new StateWaiting();
    }

    public void setCurrentState(ATMState currentState) {
        this.currentState = currentState;
    }
    
    public String runCommand(String command){
        return this.currentState.runState(this, command);
    }
    
    
}
