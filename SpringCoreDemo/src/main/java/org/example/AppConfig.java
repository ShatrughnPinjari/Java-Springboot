package org.example;

import org.example.Payment.CardPaymentService;
import org.example.Payment.PaymentService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;

@Configurable
@ComponentScan
public class AppConfig {

    @Bean
    public Customer createCustomer(){
       return new Customer("Suresh", 36);
    }

    @Bean
    public OrderService createOrderService(){
//        PaymentService paymentService = new CardPaymentService();
//        OrderService orderService = new OrderService();
//        orderService.setOrderService(paymentService);
        return new OrderService();
    }
}
