package org.designprinciples.dip.alert;

public class EmailService implements INotifyService{
    @Override
    public void notifyCustomer() {
        System.out.println("Sending Email");
    }
}
