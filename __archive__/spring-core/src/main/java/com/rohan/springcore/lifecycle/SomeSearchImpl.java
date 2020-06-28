package com.rohan.springcore.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SomeSearchImpl {

    private final static Logger LOGGER = LoggerFactory.getLogger(SomeSearchImpl.class);

    @Autowired
    @Qualifier("heap")
    private SortingAlgorithm sortingAlgorithm;

    public int search(int[] numbers,
                      int numberToSearchFor) {
        int[] sortedNumbers = sortingAlgorithm.sort(numbers);
        return 3;
    }

    @PostConstruct
    public void postConstruct() {
        // Bean is created and all the dependencies are met
        LOGGER.info("Post construct");
    }

    @PreDestroy
    public void preDestroy() {
        // Just before the bean is removed from the context
        LOGGER.info("Pre destroy");
    }

}
