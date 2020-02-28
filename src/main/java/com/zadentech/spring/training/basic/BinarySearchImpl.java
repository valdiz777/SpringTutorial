package com.zadentech.spring.training.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    final private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private final ISortAlgorithm sortAlgorithm;

    public BinarySearchImpl(ISortAlgorithm sortAlgorithm) {
    this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        final int[] sortedNumbers = sortAlgorithm.sort(numbers);

        for (int number : sortedNumbers) {
            if (number == numberToSearchFor) {
                return number;
            }
        }
        return -1;
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("preDestroy");
    }
}