package com.design_pattern.factory_design_pattern;

public class NotificationFactory {

    public Notification creteNotification(String type){
        if(type.equalsIgnoreCase("SMS")){
            return new SMSNotification();
        }

        if(type.equalsIgnoreCase("Whatsapp")){
            return new WhatsappNotification();
        }

        throw new IllegalArgumentException("Invalid Notification Type");
    }

}
