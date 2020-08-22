package com.maistruk.spring_log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
    
    final static Logger logger = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args) {
        logger.info("Start Application");
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        System.out.println(helloWorld.getMessage());
    }
}
