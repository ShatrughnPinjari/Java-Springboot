package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        ReportService reportService = context.getBean(ReportService.class);
//        reportService.CreateReport();
//
        System.out.println("Application context created");
//        UserService userService = context.getBean(UserService.class);
//        System.out.println("Before registering user");
//        userService.RegisterUser();
//
//
//        OrderRequest orderRequest1 = new OrderRequest();
//        OrderRequest orderRequest2 = new OrderRequest();
//        System.out.println(orderRequest1 == orderRequest2);

//        OrderService orderService = context.getBean(OrderService.class);
//        orderService.placeOrder();

        User u1 = context.getBean("user1" , User.class);
        User u2 = context.getBean("user1", User.class);
        User u3 = context.getBean("user2", User.class);

        System.out.println(u1 == u2);
        System.out.println(u1 == u3);
    }
}