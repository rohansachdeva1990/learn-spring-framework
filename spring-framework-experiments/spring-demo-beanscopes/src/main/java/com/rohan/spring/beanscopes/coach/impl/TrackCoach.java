package com.rohan.spring.beanscopes.coach.impl;

import com.rohan.spring.beanscopes.coach.Coach;
import com.rohan.spring.beanscopes.coach.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        System.out.println("TrackCooach: inside constructor");
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

    // Custom hook to be called on init and destroy

    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }
}
