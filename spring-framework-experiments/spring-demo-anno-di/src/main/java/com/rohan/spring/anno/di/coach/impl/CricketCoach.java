package com.rohan.spring.anno.di.coach.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.rohan.spring.anno.di.coach.Coach;
import com.rohan.spring.anno.di.coach.FortuneService;

@Component
public class CricketCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService") 
    private FortuneService fortuneService;

    public CricketCoach() {
        // TODO Auto-generated constructor stub
        System.out.println("CricketCoach: inside default constructor");
    }
    
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    /*
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println("CricketCoach: Inside doSomeCrazyStuff");
        this.fortuneService = fortuneService;
    }*/
}
