package com.example.chat;

public class Message {

    private String sender;
    private String content;
    private long timestamp;

    public Message() {
        // Default constructor required for Firebase
    }

    public Message(String sender, String content, long timestamp) {
        this.sender = sender;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    public long getTimestamp() {
        return timestamp;
    }
}

