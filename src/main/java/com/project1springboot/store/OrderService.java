
package com.project1springboot.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService paymentService;

    //if we have a lot of constructors we have to use @@Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public  void placeOrder(){
        paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
