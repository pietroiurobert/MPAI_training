package com.example.parking.design_patterns.specification;

import com.example.parking.model.ParkingSpot;

public interface Specification {
    boolean isSatisfiedBy(ParkingSpot spot);

    default Specification and(Specification other) {
        return spot -> this.isSatisfiedBy(spot) && other.isSatisfiedBy(spot);
    }

    default Specification or(Specification other) {
        return spot -> this.isSatisfiedBy(spot) || other.isSatisfiedBy(spot);
    }
}
