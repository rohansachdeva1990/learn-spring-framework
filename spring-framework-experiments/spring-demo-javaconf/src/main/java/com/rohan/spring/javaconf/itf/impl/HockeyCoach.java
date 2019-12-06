package com.rohan.spring.javaconf.itf.impl;

import org.springframework.beans.factory.annotation.Value;

import com.rohan.spring.javaconf.itf.Coach;
import com.rohan.spring.javaconf.itf.FortuneService;

public class HockeyCoach implements Coach {

    private FortuneService fortuneService;

    /**
     * Field level injections
     */
    
    @Value("${coach.email}")
    private String email;
    
    @Value("${coach.team}")
    private String team;
    
    public HockeyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "practice penalties";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
