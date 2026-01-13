/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package activeobject.domain;

/**
 *
 * @author null
 */
public class Account {
    private int amount = 0;
    
    public void deposit(int sum){
        if (amount + sum > 0){
            amount += sum;
        }
    }
    
    public void withdraw(int sum){
        if (amount - sum > 0){
            amount -= sum;
        }
    }
    
    public int getAmount(){
        return amount;
    }
}
