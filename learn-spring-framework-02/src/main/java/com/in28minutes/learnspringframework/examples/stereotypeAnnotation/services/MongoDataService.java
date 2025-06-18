package com.in28minutes.learnspringframework.examples.stereotypeAnnotation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MongoDataService implements DataService {
    @Autowired
    private LoggerStereotype logger;
    @Override
    public int[] retrieveData() {
        logger.info("Retrieving data from MongoDB");
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }
}
