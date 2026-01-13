/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerlive.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author null
 */
public abstract class Clickable {

    private List<ClickHandler> subscribers = new ArrayList<>();

    public void subscribe(ClickHandler handler) {
        subscribers.add(handler);
    }

    public void unsubscribe(ClickHandler handler) {
        subscribers.remove(handler);
    }
    
    public void notifySubscribers(){
        for (ClickHandler subscriber : subscribers) {
            subscriber.handleClick();
        }
    }

}
