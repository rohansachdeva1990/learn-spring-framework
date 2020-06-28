package com.rohan.spring.javaconf.itf.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.rohan.spring.javaconf.itf.Coach;
import com.rohan.spring.javaconf.itf.FortuneService;

/**
 * Using default bean id
 * 
 * @author rohan
 *
 */
@Component
@Scope("prototype")
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
