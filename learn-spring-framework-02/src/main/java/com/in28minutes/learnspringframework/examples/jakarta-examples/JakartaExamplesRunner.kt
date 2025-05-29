package com.in28minutes.learnspringframework.examples.`jakarta-examples`

import org.springframework.boot.SpringApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration


@Configuration
@ComponentScan
public class JakartaExamplesRunner {
    public static void main(String[] args) {
        try (var context = SpringApplication.run(JakartaExamplesRunner.class, args)) {
            Arrays.stream(context.getBeanDefinitionNames()).sorted().forEach(System.out::println);
        }
    }
}
