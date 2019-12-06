package com.rohan.spring.beanscopes.coach.impl;

import com.rohan.spring.beanscopes.coach.Coach;
import com.rohan.spring.beanscopes.coach.FortuneService;

/**
 * Setter Injection
 * 
 * @author rohan
 *
 */
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }
}
