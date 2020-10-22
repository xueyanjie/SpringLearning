package com.xyj.service;

import com.xyj.beans.AppBean;

public class AppService {
    private AppBean messageAgent;

    public AppBean getMessageAgent() {
        return messageAgent;
    }

    public void setMessageAgent(AppBean messageAgent) {
        this.messageAgent = messageAgent;
    }

    public String showMessage() {
        return messageAgent.getMessage();
    }
}
