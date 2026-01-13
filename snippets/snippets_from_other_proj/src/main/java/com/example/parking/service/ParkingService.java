package com.example.parking.service;

import com.example.parking.design_patterns.factory.PrivateParkingFactory;
import com.example.parking.design_patterns.factory.ParkingFactory;
import com.example.parking.design_patterns.observer.ParkingNotifier;
import com.example.parking.design_patterns.observer.UserNotification;
import com.example.parking.design_patterns.specification.AvailableSpecification;
import com.example.parking.design_patterns.specification.PaidSpecification;
import com.example.parking.design_patterns.specification.Specification;
import com.example.parking.model.ParkingSpot;
import com.example.parking.model.Reservation;
import com.example.parking.repository.ParkingSpotRepository;
import com.example.parking.repository.ReservationRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParkingService {

    private final ParkingSpotRepository spotRepository;
    private final ReservationRepository reservationRepository;
    private final ParkingNotifier notifier = ParkingNotifier.getInstance();

    public ParkingService(ParkingSpotRepository spotRepository, ReservationRepository reservationRepository) {
        this.spotRepository = spotRepository;
        this.reservationRepository = reservationRepository;
        notifier.addObserver(new UserNotification());
    }
    

    public void createSpotsIfEmpty() {
        if (spotRepository.count() == 0) {
            ParkingFactory factory = new PrivateParkingFactory();
            int totalSpots = factory.createNumberOfSpots();
            for (int i = 0; i < totalSpots; i++) {
                spotRepository.save(new ParkingSpot());
            }
        }
    }

    public List<ParkingSpot> getAllSpots() {
//        return spotRepository.findAll();
        return spotRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    public ParkingSpot getSpotById(Long id) {
        return spotRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Parking spot not found"));
    }

    public void reserveSpot(Long id) {
        ParkingSpot spot = getSpotById(id);
        if (!spot.isAvailable()) {
            throw new RuntimeException("Spot already reserved!");
        }

        spot.setAvailable(false);
        spotRepository.save(spot);

        Reservation reservation = new Reservation(spot.getId());
        reservationRepository.save(reservation);

        notifier.notifyObservers("Spot " + id + " has been reserved!");
    }

    public void endReservation(Long id) {
        ParkingSpot spot = getSpotById(id);
        if (spot.isAvailable()) {
            throw new RuntimeException("Spot already free!");
        }

        spot.setAvailable(true);
        spot.setPaid(false);
        spotRepository.save(spot);

        notifier.notifyObservers("Spot " + id + " has been freed!");
    }

    public void paySpot(Long parkingSpotId) {
        ParkingSpot spot = getSpotById(parkingSpotId);
        spot.setAvailable(false);
        spot.setPaid(true);
        spotRepository.save(spot);

        Reservation reservation = reservationRepository.findAll().stream()
                .filter(r -> r.getParkingSpotId().equals(parkingSpotId) && !r.isPaid())
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Reservation not found for this spot"));
        reservation.setPaid(true);
        reservationRepository.save(reservation);

        notifier.notifyObservers("Spot " + parkingSpotId + " has been paid!");
    }

    public List<ParkingSpot> getPaidSpots() {
        Specification paidSpec = new PaidSpecification(true);
        return spotRepository.findAll().stream()
                .filter(paidSpec::isSatisfiedBy)
                .collect(Collectors.toList());
    }

    public List<ParkingSpot> getFreeSpots() {
        Specification freeSpec = new AvailableSpecification().and(new PaidSpecification(false));
        return spotRepository.findAll().stream()
                .filter(freeSpec::isSatisfiedBy)
                .collect(Collectors.toList());
    }

    public List<ParkingSpot> getFilteredSpots() {
        Specification availableSpec = new AvailableSpecification();
        Specification unpaidSpec = new PaidSpecification(false);

        Specification filter = availableSpec.or(unpaidSpec);

        return spotRepository.findAll().stream()
                .filter(filter::isSatisfiedBy)
                .collect(Collectors.toList());
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }
}
