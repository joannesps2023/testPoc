package com.example.springapps;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class RuleRequestModel {
    String message;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
