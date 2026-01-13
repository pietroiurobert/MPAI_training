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
class StateContinue implements ATMState {

    @Override
    public String runState(StateContext context, String command) {
        switch(command.trim()){
            case "y":
                context.setCurrentState(new StateWaitTransaction());
                return "enter transaction";
            case "n":
                context.setCurrentState(new StateWaiting());
                return "enter user";
            default:
                context.setCurrentState(new StateContinue());
                return "invalid selection";
        }
    }
    
}
