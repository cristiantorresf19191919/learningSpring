package com.in28minutes.learnspringframework.examples.configurationContext;

import com.in28minutes.learnspringframework.examples.one.BusinessLogic;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@Configuration
@ComponentScan
public class XmlConfigurationContextLauncherApplication {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println("Hello World");
            System.out.println(context.getBean("name"));
        }
    }
}
