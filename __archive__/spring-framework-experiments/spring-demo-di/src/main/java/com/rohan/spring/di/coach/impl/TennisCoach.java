package com.rohan.spring.di.coach.impl;

import com.rohan.spring.di.coach.Coach;
import com.rohan.spring.di.coach.FortuneService;

public class TennisCoach implements Coach {

    private String email;
    private String team;
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("TennisCoach: In no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice knocks for 30 mins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
