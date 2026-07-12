package org.example;

import org.example.Payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {

    private PaymentService paymentService;

//    @Autowired
//    public OrderService(@Qualifier("UPIPaymentService")  PaymentService paymentService){
//        this.paymentService = paymentService;
//    }

    @Autowired
    public void setOrderService(@Qualifier("cardPaymentService") PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void Order(){
        paymentService.payment();
        System.out.println("Order placed.");
    }
}
