package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age, Address address) { };

record Address(String firstLine, String city) { };

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "CristianScript";
    }
    @Bean
    public int age() {
        return 28;
    }
    @Bean
    public Person person() {
        return new Person(name(), age(), address());
    }
    @Bean
    public Person person3Parameters (String name, int age, Address address3){//name, age, address2
        return new Person(name, age, address3);
    }

    @Bean
    @Primary
    public Person person4Parameters (String name, int age, Address address){//name, age, address2
        return new Person(name, age, address);
    }

    @Bean
    public Person person5ParametersQualifier (String name, int age, @Qualifier("adress3qualifier")Address address){
        //name, age, address2
        return new Person(name, age, address);
    }

    @Bean(name = "address3")
    @Qualifier("adress3qualifier")
    public Address address3() {
        return new Address("engativa", "Bogota D.C.");
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("calle 82a", "Bogota D.C.");
    }
}
