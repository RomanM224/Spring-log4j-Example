package com.maistruk.spring_log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    
    final static Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    
    @Value("Hello")
    private String message;

    public String getMessage() {
        logger.info("get message from helloWorld");
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    

}
