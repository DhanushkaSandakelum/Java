package org.designprinciples.dip.alert;

public class SmsService implements INotifyService{
    @Override
    public void notifyCustomer() {
        System.out.println("Sending SMS");
    }
}
