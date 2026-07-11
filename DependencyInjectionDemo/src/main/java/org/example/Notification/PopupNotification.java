package org.example.Notification;

public class PopupNotification implements NotificationAPI{

    @Override
    public void sendNotification() {
        System.out.println("Popup notification has been sent.");
    }
}
