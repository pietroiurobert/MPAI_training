/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statefullatm.domain;

import java.util.Random;

/**
 *
 * @author null
 */
class StateWaitTransaction implements ATMState {

    @Override
    public String runState(StateContext context, String command) {
        String[] parts = command.trim().split("\\s");
        switch (parts[0]) {
            case "credit":
                if (checkFunds()) {
                    context.setCurrentState(new StateContinue());
                    return "performed payment. continue?";
                }
                context.setCurrentState(new StateContinue());
                return "not able to perform. continue?";

            case "debit":
                if (checkFunds()) {
                    context.setCurrentState(new StateContinue());
                    return "gave you cash. continue?";
                }
                context.setCurrentState(new StateContinue());
                return "not able to perform. continue?";

            default:
                context.setCurrentState(new StateWaiting());
                return "invalid command";
        }
    }

    private boolean checkFunds() {
        Random r = new Random();
        return r.nextBoolean();
    }

}
