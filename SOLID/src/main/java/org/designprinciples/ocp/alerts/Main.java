package org.designprinciples.ocp.alerts;

public class Main {
    public static void main(String[] args) {
        Notification sms = new SmsNotification();
        sms.sendNotification("Hello");
        Notification email = new EmailNotification();
        email.sendNotification("Hello");
    }
}
