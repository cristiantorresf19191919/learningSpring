package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppRunnerApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(AppRunnerApplication.class)) {
            var gameRunner = context.getBean(GameRunner.class);
            gameRunner.run();
        }
    }
}
