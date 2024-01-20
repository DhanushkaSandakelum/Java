package org.designprinciples.ocp.alerts;

public class EmailNotification extends Notification{
    @Override
    public void sendNotification(String msg) {
        System.out.println("Email Sent: " + msg);
    }
}
