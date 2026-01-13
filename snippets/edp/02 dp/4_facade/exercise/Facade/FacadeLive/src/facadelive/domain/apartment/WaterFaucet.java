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
public class WaterFaucet {

    private Boolean state = Boolean.FALSE;

    public void open() {
        System.out.println("opened water faucet");
        state = Boolean.TRUE;
    }

    public void close() {
        System.out.println("closed water faucet");
        state = Boolean.FALSE;
    }
}
