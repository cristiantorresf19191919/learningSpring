package com.in28minutes.learnspringframework.examples.one;

import com.in28minutes.learnspringframework.examples.one.services.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationRunner {
    public static void main(String[] args) {
        //Create the Spring Context
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationRunner.class)) {
            var businessLogic = context.getBean(BusinessLogic.class);
            var logger = context.getBean(Logger.class);
            var result = businessLogic.calculateMaxAge();
            logger.info(result);
        }
    }
}
