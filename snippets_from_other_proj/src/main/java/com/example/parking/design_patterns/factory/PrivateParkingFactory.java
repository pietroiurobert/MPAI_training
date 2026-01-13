package com.example.parking.design_patterns.factory;

public class PrivateParkingFactory implements ParkingFactory {
    @Override
    public int createNumberOfSpots() {
        return 12;
    }
}
