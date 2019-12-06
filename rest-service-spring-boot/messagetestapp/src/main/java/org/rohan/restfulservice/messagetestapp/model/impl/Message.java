package org.rohan.restfulservice.messagetestapp.model.impl;

import org.rohan.restfulservice.messagetestapp.model.ModelItf;

public class Message implements ModelItf {

    private long id;
    private String text;

    public Message() {
    }

    public Message(String text) {
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
