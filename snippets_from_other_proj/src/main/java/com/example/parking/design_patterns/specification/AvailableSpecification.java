package com.example.parking.design_patterns.specification;

import com.example.parking.model.ParkingSpot;

public class AvailableSpecification implements Specification {
    @Override
    public boolean isSatisfiedBy(ParkingSpot spot) {
        return spot.isAvailable();
    }
}
