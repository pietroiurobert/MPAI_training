/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerlive;

import observerlive.domain.ClickHandler;
import observerlive.domain.Clickable;
import observerlive.domain.FirstClickHandler;
import observerlive.domain.SecondClickHandler;
import observerlive.domain.ToggleButton;

/**
 *
 * @author null
 */
public class ObserverLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ToggleButton button = new ToggleButton();
        ClickHandler c1 = new FirstClickHandler();
        ClickHandler c2 = new SecondClickHandler();
        button.subscribe(c1);
        button.subscribe(c2);
        button.click();
    }
    
}
