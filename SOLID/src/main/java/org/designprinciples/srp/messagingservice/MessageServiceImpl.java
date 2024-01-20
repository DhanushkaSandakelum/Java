package org.designprinciples.srp.messagingservice;

public class MessageServiceImpl implements IMessageService{
    @Override
    public void printMessage(String msg) {
        System.out.println("Message: " + msg);

    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("Message is sent and content is: " + msg);

    }
}
