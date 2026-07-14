package org.example;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

//    public OrderService(PaymentService paymentService) {
//        System.out.println("Order service created");
//    }

//    private OrderRequest orderRequest;
//    public OrderService(OrderRequest orderRequest) {
//        System.out.println("OrderService created.");
//        this.orderRequest = orderRequest;
//    }


//    private final ObjectProvider<OrderRequest> orderRequestProvider;
//    public OrderService(ObjectProvider<OrderRequest> orderRequestProvider) {
//        this.orderRequestProvider = orderRequestProvider;
//        System.out.println("OrderService created.");
//    }

//    public void placeOrder(){
//        OrderRequest orderRequest = orderRequestProvider.getObject();
//        System.out.println("Using OrderRequest : " + orderRequest.getId());
//    }

    @Autowired
    private PaymentService paymentService;

//    public OrderService(@Lazy PaymentService paymentService) {
//        this.paymentService = paymentService;
//        System.out.println("OrderService created");
//    }

//    public void placeOrder() {
//        System.out.println("Order placed");
//        paymentService.pay();
//    }

    public OrderService(){
        System.out.println("OrderService constructor");
    }

//    @Autowired
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//        System.out.println("PaymentService injected into OrderService");
//    }
}
