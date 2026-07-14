package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
        System.out.println("UserService created");
    }

    public void RegisterUser(){
        System.out.println("Registering User");
        emailService.sendEmail();
    }
}
