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
public class ToggleButton extends Clickable{
    private Boolean isClicked = false;
    
    
    public void click(){
        isClicked = !isClicked;
        this.notifySubscribers();
    }
}
