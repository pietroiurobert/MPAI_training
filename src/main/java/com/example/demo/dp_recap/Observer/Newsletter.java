package com.example.demo.dp_recap.Observer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class Newsletter implements Observer {
    private Set<Subscriber> subscribers;
    private String newsletter_name;

    public Newsletter() {
        this.subscribers = new HashSet<>();
        this.newsletter_name = "TEST";
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void sendPushNotification(String message) {
        for (Subscriber subscriber: subscribers) {
            subscriber.receiveNotification(message);
        }
    }
}
