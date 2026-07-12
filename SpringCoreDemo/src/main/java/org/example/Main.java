package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;

public class Main {
    public static void main(String[] args) {
//        PaymentService paymentService = new PaymentService();
//        OrderService orderService = new OrderService(paymentService);
//        orderService.Order();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.Order();

        Customer customer = context.getBean(Customer.class);
//        System.out.println(customer.getName());
    }
}