package com.in28minutes.learnspringframework.examples.businessDataCalculator.services;

import org.springframework.stereotype.Component;

@Component
public class Looger {
    public void info(Object msg){
        System.out.println(msg);
    }
}
