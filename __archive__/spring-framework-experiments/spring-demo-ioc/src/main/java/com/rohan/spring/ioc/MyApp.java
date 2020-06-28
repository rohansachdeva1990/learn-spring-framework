package com.rohan.spring.ioc;

import com.rohan.spring.ioc.coach.Coach;
import com.rohan.spring.ioc.coach.impl.TrackCoach;

public class MyApp {
    public static void main(String[] args) {

        // 1. Create the object
        //Coach theCoach = new BaseballCoach();
        Coach theCoach = new TrackCoach();
        
        // 2. Use the Object
        System.out.println(theCoach.getDailyWorkout());
        
    }
}
