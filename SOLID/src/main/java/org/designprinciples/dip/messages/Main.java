package org.designprinciples.dip.messages;

public class Main {
    public static void main(String[] args) {
        MessagingService messagingService = new MessagingService(new EmailService());
        messagingService.sendMessage("Sample Message", "X", "Y");
    }
}
