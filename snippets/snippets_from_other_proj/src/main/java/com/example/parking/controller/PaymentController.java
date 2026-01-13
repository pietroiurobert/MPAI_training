package com.example.parking.controller;

import com.example.parking.design_patterns.strategy.CardPayment;
import com.example.parking.design_patterns.strategy.CashPayment;
import com.example.parking.design_patterns.strategy.PaymentStrategy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PaymentController{
    @PostMapping("/pay")
    public String pay(@RequestParam String method){
        PaymentStrategy strategy=method.equals("CARD")? new CardPayment() : new CashPayment();
        strategy.pay(10);
        return "redirect:/";
    }
}