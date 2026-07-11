package org.example;


import org.example.Notification.EmailNotification;
import org.example.Notification.NotificationAPI;
import org.example.Notification.PopupNotification;
import org.example.Notification.smsNotification;

public class Main {
    public static void main(String[] args) {
//        EmailNotification emailNotification = new EmailNotification();
//        PopupNotification popupNotification = new PopupNotification();
//        smsNotification smsNotification = new smsNotification();

        NotificationAPI notificationAPI = new smsNotification();
        // OrderAPI order = new OrderAPI(smsNotification);
        OrderAPI orderAPI = new OrderAPI();
        orderAPI.setNotificationAPI(notificationAPI);
        orderAPI.placeOrder();
    }
}