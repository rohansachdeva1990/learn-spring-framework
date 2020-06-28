package com.rohan.spring.basics.springbasics.lifecycle;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("heap")
public class HeapSortAlgorithm implements SortingAlgorithm {

    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
