package com.rohan.spring.di.coach.impl;

import com.rohan.spring.di.coach.Coach;
import com.rohan.spring.di.coach.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    
	@Override
    public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
