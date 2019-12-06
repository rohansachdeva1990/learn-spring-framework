package com.rohan.spring.javaconf.itf.impl;

import com.rohan.spring.javaconf.itf.Coach;
import com.rohan.spring.javaconf.itf.FortuneService;


/**
 * We will be using constructor injection
 * @author rohan
 *
 */
public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do freestyle 10 rounds";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
