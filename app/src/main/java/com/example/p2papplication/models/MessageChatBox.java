package com.example.p2papplication.models;

public class MessageChatBox {
    Boolean isYours;
    String message;

    public MessageChatBox() {
        isYours = false;
        message = "";
    }

    public MessageChatBox(Boolean isYours, String message) {
        this.isYours = isYours;
        this.message = message;
    }

    public Boolean getYours() {
        return isYours;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setYours(Boolean yours) {
        isYours = yours;
    }
}
