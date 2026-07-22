package org.example;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner /*ApplicationRunner*/ {

    private OrderService orderService;

    public AppRunner(OrderService orderService) {
        this.orderService = orderService;
    }
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        orderService.PlaceOrder();
//    }

    @Override
    public void run(String... args) throws Exception {
        orderService.PlaceOrder();

    }


}
