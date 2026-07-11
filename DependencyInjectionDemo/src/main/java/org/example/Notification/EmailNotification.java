package org.example.Notification;

public class EmailNotification implements NotificationAPI {

    @Override
     public void sendNotification(){
         System.out.println("Email notification has been sent.");
     }
}
