/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observernews.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author null
 */
public abstract class Newspaper implements ContentProvider{
       private List<NewsSubscriber> subscribers = new ArrayList<>();

    public void subscribe(NewsSubscriber handler) {
        subscribers.add(handler);
    }

    public void unsubscribe(NewsSubscriber handler) {
        subscribers.remove(handler);
    }
    
    public void notifySubscribers(){
        for (NewsSubscriber subscriber : subscribers) {
            subscriber.notifyNewsSubscriber(this);
        }
    }
}
