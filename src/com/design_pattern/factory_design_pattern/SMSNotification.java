package com.design_pattern.factory_design_pattern;

public class SMSNotification implements Notification{
    @Override
    public void send() {
        System.out.println(" send SMS notification ");
    }
}
