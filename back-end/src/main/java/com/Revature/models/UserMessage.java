package com.Revature.models;

import jakarta.persistence.*;

@Entity
@Table(name = "user_messages")
public class UserMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private int messageId;

    @Column(name = "message")
    private String message;

    @Column(name = "user_id")
    private int userId;

    public UserMessage() {
    }

    public UserMessage(int messageId, String message, int userId) {
        this.messageId = messageId;
        this.message = message;
        this.userId = userId;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
