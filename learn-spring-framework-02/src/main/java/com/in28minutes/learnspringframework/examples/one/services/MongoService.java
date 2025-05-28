package com.in28minutes.learnspringframework.examples.one.services;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoService implements DataContract {
    @Autowired
    Logger logger;
    @Override
    public int[] getAges() {
        logger.info("Inside getAges Mongo");
        return new int[]{25,21,20,15,19,18,23,24,25,26,29,99};
    }
}
