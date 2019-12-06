package com.rohan.spring.basics.springbasics.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    @Qualifier("bubble")
    private SortingAlgorithm sortingAlgorithm;

    public int binarySearch(int[] numbers,
                            int numberToSearchFor) {

        int[] sortedNumbers = sortingAlgorithm.sort(numbers);
        return 3;
    }
}
