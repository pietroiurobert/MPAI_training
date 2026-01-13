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
public interface ATMState {
    public String runState(StateContext context, String command);
}
