package org.example;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService Constructed.");
    }

    public void PlaceOrder(){
        paymentService.pay();
        System.out.println("Order Placed.");
    }
}
