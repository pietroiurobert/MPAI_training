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
public class StatePIN implements ATMState {

    @Override
    public String runState(StateContext context, String command) {
        switch(command.trim()){
            case "1234":
                context.setCurrentState(new StateWaitTransaction());
                return "enter transaction";
            default:
                context.setCurrentState(new StateWaiting());
                return "invalid pin";
        }
    }

    
}
