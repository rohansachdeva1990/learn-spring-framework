package com.rohan.spring.anno.coach.impl;

import org.springframework.stereotype.Component;

import com.rohan.spring.anno.coach.Coach;

/**
 * Using default bean id
 * @author rohan
 *
 */
@Component
public class GymCoach implements Coach {
    
    @Override
    public String getDailyWorkout() {
        return "Do 100 push ups";
    }

}
