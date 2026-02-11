package com.project1springboot.store;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Stripping");
        System.out.println("Amount : " + amount);
    }
}
