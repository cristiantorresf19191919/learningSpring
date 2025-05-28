package com.in28minutes.learnspringframework.examples.businessDataCalculator;

import com.in28minutes.learnspringframework.examples.businessDataCalculator.services.DataService;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {
    private DataService dataservice;

    public BusinessCalculationService(DataService dataservice) {
        this.dataservice = dataservice;
    }

    public int findMax(){
        var data = dataservice.retrieveData();
        return Arrays.stream(data).max().getAsInt();
    }
}
