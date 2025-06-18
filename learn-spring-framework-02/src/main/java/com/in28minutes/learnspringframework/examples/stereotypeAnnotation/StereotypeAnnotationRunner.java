package com.in28minutes.learnspringframework.examples.stereotypeAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class StereotypeAnnotationRunner {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(StereotypeAnnotationRunner.class)) {
            var businessCalc = context.getBean(BusinessCalculationService.class);
            System.out.println(businessCalc.findMax());
        }
    }
}
