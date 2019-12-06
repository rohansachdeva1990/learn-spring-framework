package com.rohan.spring.ioc.coach.impl;

import com.rohan.spring.ioc.coach.Coach;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5 km";
    }
}
