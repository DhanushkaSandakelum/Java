package org.designprinciples.srp.messagingservice;

public interface IMessage {
    void writeMessage(String msg);
    void replaceMessageContent(String src, String dest);
}
