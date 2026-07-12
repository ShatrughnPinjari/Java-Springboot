package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    private final OrderService orderService;

    public PaymentService(OrderService orderService){
        this.orderService = orderService;
        System.out.println("Payment service created.");
    }

    public void pay(){
        System.out.println("Payment is successful.");
    }
}
