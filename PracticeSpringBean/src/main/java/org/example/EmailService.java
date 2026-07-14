package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class EmailService {

    public EmailService(){
        System.out.println("Email Service Initialized");
    }

    public void sendEmail(){
        System.out.println("Sending Email");
    }
}
