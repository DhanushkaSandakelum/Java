package org.designprinciples.dip.messages;

public class MessagingService {
    MessageSender messageSender;

    public MessagingService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendMessage(String message, String to, String from) {
        messageSender.sendMessage(message, to, from);
    }
}
