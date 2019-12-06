package com.rohan.spring.di.coach.impl;

import com.rohan.spring.di.coach.Coach;
import com.rohan.spring.di.coach.FortuneService;

public class ProgrammingCoach implements Coach {

    private FortuneService fortuneService;
   
    public ProgrammingCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice 5 Algorithms questions a day";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
