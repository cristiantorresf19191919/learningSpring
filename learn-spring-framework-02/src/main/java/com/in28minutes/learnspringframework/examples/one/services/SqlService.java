package com.in28minutes.learnspringframework.examples.one.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sqlservice")
public class SqlService implements DataContract {
    @Autowired
    Logger logger;
    @Override
    public int[] getAges() {
        logger.info("Getting ages from SQL");
        return new int[]{20,20,56,89,20,10,15};
    }
}
