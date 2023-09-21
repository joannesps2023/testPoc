package com.example.springapps;

import org.springframework.stereotype.Component;

@Component
public class RuleResponseModel {
    String message;
    Integer id;

    String configName;
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

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }
}
