package com.example.parking.design_patterns.factory;

public class PublicParkingFactory implements ParkingFactory{
    @Override
    public int createNumberOfSpots() {
        return 10;
    }
}
