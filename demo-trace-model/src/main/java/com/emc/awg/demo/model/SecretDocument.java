package com.emc.awg.demo.model;

/**
 * Demo model
 */
public class SecretDocument {

    private String content;

    public SecretDocument(){}

    public SecretDocument(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
