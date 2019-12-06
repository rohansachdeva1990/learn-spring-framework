package com.rohan.spring.di.coach.impl;

import com.rohan.spring.di.coach.Coach;
import com.rohan.spring.di.coach.FortuneService;

public class GymCoach implements Coach {

    private String email;
    private String team;
    private FortuneService fortuneService;

    public GymCoach() {
        System.out.println("GymCoach: inside no-arg constructor.");
    }

    @Override
    public String getDailyWorkout() {
        return "Do 50 Pushup";
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("GymCoach: inside setter method: setFortuneService()");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("GymCoach: inside setter method: setEmail()");
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("GymCoach: inside setter method: setTeam()");
        this.team = team;
    }
}
