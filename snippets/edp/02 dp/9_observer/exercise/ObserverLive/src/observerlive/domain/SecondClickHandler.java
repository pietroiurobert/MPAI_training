/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerlive.domain;

/**
 *
 * @author null
 */
public class SecondClickHandler implements ClickHandler{

    @Override
    public void handleClick() {
        System.out.println("i have been notified to do even more awesome things");
    }
    
}
