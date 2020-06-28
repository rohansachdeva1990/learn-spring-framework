package com.rohan.spring.anno.di.coach.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.rohan.spring.anno.di.coach.Coach;
import com.rohan.spring.anno.di.coach.FortuneService;

/**
 * Using default bean id
 * 
 * @author rohan
 *
 */
@Component
public class GymCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService") 
    private FortuneService fortuneService;

    public GymCoach() {
        // TODO Auto-generated constructor stub
        System.out.println("GymCoach: inside default constructor");
    }
    
/*    public GymCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
*/
    @Override
    public String getDailyWorkout() {
        return "Do 100 push ups";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
