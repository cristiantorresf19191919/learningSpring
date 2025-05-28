package com.in28minutes.learnspringframework.examples.one;

import com.in28minutes.learnspringframework.examples.one.services.DataContract;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@ComponentScan("com.in28minutes.learnspringframework.examples.one.services")
public class BusinessLogic {
    DataContract dataContract;
    public BusinessLogic(DataContract dataContract) {
        this.dataContract = dataContract;
    }

    public int calculateMaxAge(){
        //functional programming with Stream the max value
        var ages = this.dataContract.getAges();
        return Arrays.stream(ages).max().getAsInt();
    }
}
