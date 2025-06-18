package com.in28minutes.learnspringframework.examples.prepostannotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class Console {
    public static void log(Object message) {
        System.out.println(message);
    }
}

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency dependency) {
        this.someDependency = dependency;
        System.out.println("🤠SomeClass Initialized🤠🤠");
    }
    //After the dependencies are auto wired
    @PostConstruct
    public void initialize(){
        this.someDependency.getReady();
    }

    @PreDestroy
    public void cleanUp(){
        Console.log("🤠SomeClass Cleaned Up🤠🤠");
    }
}

@Component
class SomeDependency {
    public void getReady() {
        System.out.println("🤠SomeDependency Logic Simulated🤠🤠");
    }
}


@Configuration
@ComponentScan
public class PrepostRunnerApplication {
    public static void main(String[] args) {
        try (
                var context = new AnnotationConfigApplicationContext(PrepostRunnerApplication.class)
        ) {
            //Print bean dependencies on the context
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }
    }
}
