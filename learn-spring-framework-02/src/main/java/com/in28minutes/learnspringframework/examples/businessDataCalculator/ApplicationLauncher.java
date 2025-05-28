package com.in28minutes.learnspringframework.examples.businessDataCalculator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationLauncher {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        try (var context = new AnnotationConfigApplicationContext(ApplicationLauncher.class)) {
            var businessCalc = context.getBean(BusinessCalculationService.class);
            System.out.println(businessCalc.findMax());
        }
    }
}
