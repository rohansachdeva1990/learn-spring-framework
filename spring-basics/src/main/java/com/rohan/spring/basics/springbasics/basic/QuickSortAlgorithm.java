package com.rohan.spring.basics.springbasics.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
