package org.example;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public PaymentService(){
        System.out.println("PaymentService Constructed");
    }

    public void pay(){
        System.out.println("Payment Done");
    }
}
