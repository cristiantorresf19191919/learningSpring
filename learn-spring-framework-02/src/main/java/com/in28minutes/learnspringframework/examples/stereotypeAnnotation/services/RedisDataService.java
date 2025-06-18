package com.in28minutes.learnspringframework.examples.stereotypeAnnotation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("redis")
public class RedisDataService implements DataService {
    @Autowired
    private LoggerStereotype logger;
    @Override
    public int[] retrieveData() {
        logger.info("Retrieving data from Redis");
        return new int[]{99,89,79,69,59,49,39,29,19,0};
    }
}
