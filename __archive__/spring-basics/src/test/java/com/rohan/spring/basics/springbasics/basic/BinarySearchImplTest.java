package com.rohan.spring.basics.springbasics.basic;

import com.rohan.spring.basics.springbasics.SpringBasicsApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


// Launches the configuration
@RunWith(SpringRunner.class)
// Load the context
@ContextConfiguration(classes = SpringBasicsApplication.class)
public class BinarySearchImplTest {

    @Autowired
    private BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        int result = binarySearch.binarySearch(new int[]{1, 2, 2, 4}, 3);
        assertEquals(3, result);
    }

}