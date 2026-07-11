package org.example;

import org.example.Notification.EmailNotification;
import org.example.Notification.NotificationAPI;
import org.example.Notification.PopupNotification;
import org.example.Notification.smsNotification;

public class OrderAPI {

    NotificationAPI notificationAPI;

    public OrderAPI(NotificationAPI notificationAPI) {
        this.notificationAPI = notificationAPI;
    }

    public OrderAPI(){}

    public void setNotificationAPI(NotificationAPI notificationAPI) {
        this.notificationAPI = notificationAPI;
    }

    public void placeOrder(){
        System.out.println("Order has been placed.");
        notificationAPI.sendNotification();
    }
}
