package com.rohan.spring.basics.springbasics.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortingAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
