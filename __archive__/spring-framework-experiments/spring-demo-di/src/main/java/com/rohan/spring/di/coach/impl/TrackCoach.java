package com.rohan.spring.di.coach.impl;

import com.rohan.spring.di.coach.Coach;
import com.rohan.spring.di.coach.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(){}
    
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5 km";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It, " + this.fortuneService.getFortune();
    }
}
