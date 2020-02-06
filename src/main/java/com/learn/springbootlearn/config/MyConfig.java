package com.learn.springbootlearn.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "server")
public class MyConfig {
    private String port;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private String name;

    public String getPort(){
        return this.port;
    }

    public void setPort(String port){
        this.port=port;
    }
}
