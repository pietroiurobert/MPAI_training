/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activeobject;

import activeobject.domain.AccountTask;

/**
 *
 * @author null
 */
public class ActiveObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        AccountTask task = new AccountTask();
        task.deposit(100);
        task.withdraw(50);
    }
    
}
