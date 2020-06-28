package com.rohan.spring.basics.springbasics.cdi;

import com.rohan.spring.basics.springbasics.SpringCDIApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * Here we are depending on the data layer.
 *
 * with mockito you don't even need to autowire stuff
 * just do mocking and inject them accordingly
 *
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringCDIApplication.class)
public class SomeCdiBusinessTest {

    @Autowired
    private SomeCdiBusiness business;

    @Test
    public void testScenario() {
        int greatest = business.findGreatest();
        assertEquals(100, greatest);
    }
}