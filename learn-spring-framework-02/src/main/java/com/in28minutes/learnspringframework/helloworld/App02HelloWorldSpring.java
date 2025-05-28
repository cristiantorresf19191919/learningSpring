
package com.in28minutes.learnspringframework.helloworld;

import com.in28minutes.learnspringframework.utils.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

class BuildContext {
    AnnotationConfigApplicationContext context;
    Logger logger;

    public BuildContext(Class<?>... configClass) {
        this.context = createContext(configClass);
        logger = new Logger();
    }

    public void getDep(Object dependency) {
        // 1) Handle Class<?> arguments
        if (dependency instanceof Class<?> type) {
            logger.info(context.getBean(type));
            return;
        }

        // 2) Handle bean by name
        if (dependency instanceof String name) {
            try {
                logger.info(context.getBean(name));
            } catch (Exception e) {
                logger.info(name);
            }
            return;
        }

        // 3) Handle all String beans if someone literally passes String.class
        if (dependency == String.class) {
            for (String beanName : context.getBeanNamesForType(String.class)) {
                logger.info(context.getBean(beanName));
            }
            return;
        }
    }

    private AnnotationConfigApplicationContext createContext(Class<?>... configClass) {
        return new AnnotationConfigApplicationContext(configClass);
    }
}

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1: Launch a Spring Context
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            //2: Configure the things we want spring to do Configuration
            var personParameters = context.getBean("person3Parameters");
            var person4Parameters = context.getBean("person4Parameters");
            System.out.println(context.getBean(Person.class));
            //Functional Programming
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            //method reference
        }
    }
}
