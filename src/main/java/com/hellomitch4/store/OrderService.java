package com.hellomitch4.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService, int x) {
    }

    @Autowired // not necessary if a class have a single constructor
    public OrderService(@Qualifier("stripe") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }
}
