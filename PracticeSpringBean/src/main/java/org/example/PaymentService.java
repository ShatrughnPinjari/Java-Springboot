package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PaymentService {

    @Autowired
    private OrderService orderService;

//    public PaymentService(PaymentGateway paymentGateway) {
//        System.out.println("Payment service created");
//    }

//    public PaymentService(OrderService orderService) {
//        this.orderService = orderService;
//        System.out.println("Payment service created");
//    }

//    public void pay(){
//        System.out.println("Payment is done");
//    }

    public PaymentService(){
        System.out.println("Payment service constructor");
    }

//    @Autowired
//    public void setOrderService(OrderService orderService) {
//        this.orderService = orderService;
//        System.out.println("OrderService injected into PaymentService");
//    }
}
