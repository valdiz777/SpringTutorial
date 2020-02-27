package com.zadentech.spring.training.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements ISortAlgorithm {

    @Override
    public int[] sort(int[] numbers) {
        
        return numbers;
    }

}