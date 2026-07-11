package org.example.Notification;

public class smsNotification implements NotificationAPI {
    @Override
    public void sendNotification() {
        System.out.println("sma has been sent.");
    }
}
