package com.rohan.spring.anno.coach.impl;

import org.springframework.stereotype.Component;

import com.rohan.spring.anno.coach.Coach;

@Component("theSillyCoach")
public class TrackCoach implements Coach {

    public TrackCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5 km";
    }

}
