package com.learn.springbootlearn.controllers;


import com.learn.springbootlearn.config.MyConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private Logger logger= LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private MyConfig myConfig;

    @GetMapping("/hello")
    public String hello() {
        logger.info("dddd----------------");
        return "hello" + myConfig.getName() + myConfig.getPort();
    }
}
