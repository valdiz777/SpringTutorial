package com.zadentech.spring.training.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    @Autowired
    private final ISortAlgorithm sortAlgorithm;

    public BinarySearchImpl(ISortAlgorithm sortAlgorithm) {
    this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        final int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        for (int number : sortedNumbers) {
            if (number == numberToSearchFor) {
                return number;
            }
        }
        return -1;
    }

}