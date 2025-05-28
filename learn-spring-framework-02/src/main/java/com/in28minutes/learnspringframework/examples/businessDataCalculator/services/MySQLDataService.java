package com.in28minutes.learnspringframework.examples.businessDataCalculator.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.in28minutes.learnspringframework.examples.one.services.Logger;

@Component
@Qualifier("mysql")
public class MySQLDataService implements DataService {
    private Logger logger;
    @Override
    public int[] retrieveData() {
        logger.info("Retrieving data from MySQL");
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }
}
