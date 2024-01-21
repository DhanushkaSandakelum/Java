package org.designprinciples.dip.alert;

public class NotificationManager {
    INotifyService notifyService;

    NotificationManager(INotifyService notifyService) {
        this.notifyService = notifyService;
    }

    public void notifyCustomer() {
        notifyService.notifyCustomer();
    }
}
