package com.example.springapps;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class RuleRequestModel {
    String message;
    Integer id;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
