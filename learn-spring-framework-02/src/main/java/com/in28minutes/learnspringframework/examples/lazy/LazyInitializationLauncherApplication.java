package com.in28minutes.learnspringframework.examples.lazy;
import java.util.function.Consumer;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB{
    private ClassA classA;

    public ClassB(ClassA classA) {
        //Logic Complex simulated
        System.out.println("😊Some Initialization Logic");
        this.classA = classA;
    }

    public void doSomething(){
        System.out.println("Do Something");
    }

}

//By default all classes are SingleTons
@Component
class NormalClass {

}

//Prototypes one object instance per IoC Container
//Create each time we require a BEAN
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
    public static void main(String[] args) {
        try (var context= new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)){
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));

            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }

    }

}
