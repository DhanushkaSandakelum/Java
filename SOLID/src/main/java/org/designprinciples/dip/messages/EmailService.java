package org.designprinciples.dip.messages;

// Low-level module
public class EmailService implements MessageSender{

    @Override
    public void sendMessage(String message, String to, String from) {
        System.out.println("Sending email: " + message + " To: " + to +  " From: " + from);
    }
}
