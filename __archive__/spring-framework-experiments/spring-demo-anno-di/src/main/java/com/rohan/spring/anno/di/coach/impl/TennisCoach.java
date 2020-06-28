package com.rohan.spring.anno.di.coach.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.rohan.spring.anno.di.coach.Coach;
import com.rohan.spring.anno.di.coach.FortuneService;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService") 
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("TennisCoach: inside default constructor");
    }

 
/*    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
*/
    @Override
    public String getDailyWorkout() {
        return "Practice back hand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
