package com.in28minutes.learnspringframework.examples.one.services;

import org.springframework.stereotype.Component;

@Component
public class Logger {
    public void info(Object message) {
        System.out.println(message);
    }
}
