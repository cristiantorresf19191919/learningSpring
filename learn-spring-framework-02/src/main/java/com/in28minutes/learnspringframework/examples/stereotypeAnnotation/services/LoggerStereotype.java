package com.in28minutes.learnspringframework.examples.stereotypeAnnotation.services;

import org.springframework.stereotype.Component;

@Component
public class LoggerStereotype {
    public void info(Object msg){
        System.out.println(msg);
    }
}
