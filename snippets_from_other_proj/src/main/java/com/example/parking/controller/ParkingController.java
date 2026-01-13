package com.example.parking.controller;

import com.example.parking.design_patterns.strategy.CardPayment;
import com.example.parking.design_patterns.strategy.CashPayment;
import com.example.parking.design_patterns.strategy.PaymentStrategy;
import com.example.parking.service.ParkingService;
import com.example.parking.model.ParkingSpot;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ParkingController {
    private final ParkingService parkingService;

    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @GetMapping("/reserve/{id}")
    public String reserve(@PathVariable Long id){
        parkingService.reserveSpot(id);
        return "redirect:/";
    }

    @PostMapping("/endReservation/{id}")
    public String endReservation(@PathVariable Long id) {
        parkingService.endReservation(id);
        return "redirect:/";
    }

    @PostMapping("/pay/{id}")
    public String pay(@PathVariable Long id, @RequestParam String method){
        ParkingSpot spot = parkingService.getSpotById(id);

        PaymentStrategy strategy = method.equals("CARD") ? new CardPayment() : new CashPayment();
        strategy.pay(10);

        parkingService.paySpot(id);

        return "redirect:/?message=Payment successful!";
    }
    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(required = false) String message) {
        parkingService.createSpotsIfEmpty();

        model.addAttribute("allSpots", parkingService.getAllSpots()); // tabel general
        model.addAttribute("filteredSpots", parkingService.getFilteredSpots()); // tabel filtrat
        model.addAttribute("paidSpots", parkingService.getPaidSpots()); // tabel plătite
        model.addAttribute("freeSpots", parkingService.getFreeSpots()); // tabel libere
        model.addAttribute("message", message);

        return "index";
    }


}
