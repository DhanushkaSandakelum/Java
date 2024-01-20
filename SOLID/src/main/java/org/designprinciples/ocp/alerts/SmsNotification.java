package org.designprinciples.ocp.alerts;

public class SmsNotification extends Notification{
    @Override
    public void sendNotification(String msg) {
        System.out.println("SMS Sent: " + msg);
    }
}
