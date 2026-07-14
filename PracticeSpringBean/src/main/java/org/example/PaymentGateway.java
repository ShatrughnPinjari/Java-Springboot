package org.example;

import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {
    public PaymentGateway(){
        System.out.println("Payment gateway created");
    }
}
