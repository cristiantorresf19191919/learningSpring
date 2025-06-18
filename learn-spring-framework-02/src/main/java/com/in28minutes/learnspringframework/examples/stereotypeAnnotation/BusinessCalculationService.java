package com.in28minutes.learnspringframework.examples.stereotypeAnnotation;

import com.in28minutes.learnspringframework.examples.stereotypeAnnotation.services.DataService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessCalculationService {
    private DataService dataservice;

    public BusinessCalculationService(@Qualifier("redis") DataService dataservice) {
        this.dataservice = dataservice;
    }

    public int findMax(){
        var data = dataservice.retrieveData();
        return Arrays.stream(data).max().getAsInt();
    }
}
