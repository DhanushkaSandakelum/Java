package org.designprinciples.srp.messagingservice;

public class MessageImpl implements IMessage{
    private String content;

    public String getContent() {
        return content;
    }

    @Override
    public void writeMessage(String msg) {
        this.content = msg;
    }

    @Override
    public void replaceMessageContent(String src, String dest) {
        this.content = this.content.replace(src, dest);
    }
}
