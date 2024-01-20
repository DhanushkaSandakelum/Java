package org.designprinciples.srp.messagingservice;

public class Main {
    public static void main(String[] args) {
        MessageImpl message = new MessageImpl();
        message.writeMessage("Hi, This is an example");
        message.replaceMessageContent("Hi", "Hello");

        MessageServiceImpl messageService = new MessageServiceImpl();
        messageService.printMessage(message.getContent());
        messageService.sendMessage(message.getContent());
    }
}
