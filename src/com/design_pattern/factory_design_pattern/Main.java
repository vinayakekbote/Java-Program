package com.design_pattern.factory_design_pattern;

public class Main {

    public static void main(String[] args) {

        NotificationFactory factory = new NotificationFactory();

        Notification notification = factory.creteNotification("SMS");
        notification.send();


    }
}
