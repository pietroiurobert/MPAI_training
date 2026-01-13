package com.example.parking.design_patterns.strategy;

public class CashPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+" in cash");
    }
}
