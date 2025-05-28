package com.in28minutes.learnspringframework.examples.businessDataCalculator.services;

import com.in28minutes.learnspringframework.examples.one.services.Logger;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDataService implements DataService {
    private Logger logger;
    @Override
    public int[] retrieveData() {
        logger.info("Retrieving data from MongoDB");
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }
}
