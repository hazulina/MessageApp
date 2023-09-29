package com.example.messageapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private int messageId;
    @Column(name = "message_text")
    private String messageText;
    @Column(name = "sender_name")
    private String senderName;

    public Message() {
    }

    public Message(String messageText, String senderName) {
        this.messageText = messageText;
        this.senderName = senderName;
    }

    public int getMessageId() {
        return messageId;
    }

    public String getMessageText() {
        return messageText;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }
}
