package com.example.parking.design_patterns.specification;

import com.example.parking.model.ParkingSpot;

public class PaidSpecification implements Specification {
    private final boolean paidStatus;

    public PaidSpecification(boolean paidStatus) {
        this.paidStatus = paidStatus;
    }

    @Override
    public boolean isSatisfiedBy(ParkingSpot spot) {
        return spot.isPaid() == paidStatus;
    }
}
