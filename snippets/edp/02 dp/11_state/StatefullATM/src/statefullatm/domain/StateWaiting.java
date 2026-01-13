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
public class StateWaiting implements ATMState{

    @Override
    public String runState(StateContext context, String command) {
        String[] parts = command.trim().split("\\s");
        switch(parts[0]){
            case "login":
                if ("testuser".equals(parts[1])){
                    context.setCurrentState(new StatePIN());
                    return "enter pin";
                }
                else{
                    context.setCurrentState(new StateWaiting());
                    return "user invalid";
                }
            default:
                context.setCurrentState(new StateWaiting());
                return "invalid command";
        }
    }
    
}
