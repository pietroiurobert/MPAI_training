package com.example.demo.dp_recap.Observer;

public interface Observer {
    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void sendPushNotification(String message);
}
