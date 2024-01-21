package org.designprinciples.dip.messages;

public interface MessageSender {
    void sendMessage(String message, String to, String from);
}
