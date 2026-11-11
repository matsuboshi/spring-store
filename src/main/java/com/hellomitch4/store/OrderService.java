package com.hellomitch4.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;

//@Service
public class OrderService {
    private PaymentService paymentService;

    @Autowired // not necessary if a class have a single constructor
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService created");
    }

    @PostConstruct
    public void init() {
        System.out.println("OrderService post construct");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("OrderService pre destroy");
    }


    public void placeOrder() {
        paymentService.processPayment(10);
    }
}
