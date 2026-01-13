package com.example.parking.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ParkingNotifier {
    private final List<Observer> observers = new ArrayList<>();

    private static ParkingNotifier instance;

    private ParkingNotifier() {}

    public static synchronized ParkingNotifier getInstance() {
        if (instance == null) {
            instance = new ParkingNotifier();
        }
        return instance;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer obs : observers) {
            obs.update(message);
        }
    }
}
