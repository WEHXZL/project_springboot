package com.bdqn.sbproject.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Comment {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "text='" + text + '\'' +
                '}';
    }
}
