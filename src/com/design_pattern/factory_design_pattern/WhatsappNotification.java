package com.design_pattern.factory_design_pattern;

public class WhatsappNotification implements Notification{
    @Override
    public void send() {
        System.out.println("send whatsapp notifications");
    }
}
