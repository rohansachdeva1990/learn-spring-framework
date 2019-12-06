package com.rohan.spring.beanscopes.coach.impl;

import com.rohan.spring.beanscopes.coach.Coach;
import com.rohan.spring.beanscopes.coach.FortuneService;

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
