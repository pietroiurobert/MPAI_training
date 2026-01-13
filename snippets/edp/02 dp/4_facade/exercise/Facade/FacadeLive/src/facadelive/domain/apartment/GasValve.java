/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadelive.domain.apartment;

/**
 *
 * @author null
 */
public class GasValve {
    private Boolean state = Boolean.FALSE;
    
    public void open(){
        System.out.println("opened gas valve");
        state  = Boolean.TRUE;
    }
    
    public void close(){
        System.out.println("closed gas valve");
        state = Boolean.FALSE;
    }
}
