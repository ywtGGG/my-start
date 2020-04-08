package com.test.start2.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("com.test.mystart")
public class MyServiceConfigProperties {
    private String name;
    private String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
