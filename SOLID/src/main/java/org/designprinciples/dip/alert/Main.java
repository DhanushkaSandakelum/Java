package org.designprinciples.dip.alert;

public class Main {
    public static void main(String[] args) {
        NotificationManager notificationManager = new NotificationManager(new SmsService());
        notificationManager.notifyCustomer();
    }
}
