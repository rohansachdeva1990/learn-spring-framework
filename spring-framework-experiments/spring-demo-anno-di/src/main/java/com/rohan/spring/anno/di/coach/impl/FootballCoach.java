package com.rohan.spring.anno.di.coach.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.rohan.spring.anno.di.coach.Coach;
import com.rohan.spring.anno.di.coach.FortuneService;

@Component
public class FootballCoach implements Coach {

    @Autowired
    @Qualifier("databaseFortuneService") 
    private FortuneService fortuneService;

    public FootballCoach() {
        // TODO Auto-generated constructor stub
        System.out.println("FootballCoach: inside default constructor");
    }
    
    @Override
    public String getDailyWorkout() {
        return "Practice cross and dribbling";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
