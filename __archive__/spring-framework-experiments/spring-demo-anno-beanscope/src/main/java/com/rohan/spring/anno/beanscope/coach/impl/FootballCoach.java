package com.rohan.spring.anno.beanscope.coach.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.rohan.spring.anno.beanscope.coach.Coach;
import com.rohan.spring.anno.beanscope.coach.FortuneService;


/**
 * This bean will show the bean lifecycle
 * @author rohan
 *
 */

@Component
public class FootballCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService") 
    private FortuneService fortuneService;

    public FootballCoach() {
        // TODO Auto-generated constructor stub
        System.out.println("FootballCoach: inside default constructor");
    }
    
    @Override
    public String getDailyWorkout() {
        return "Practice cross and dribbling";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PostConstruct
    public void doMyStartUpStuff(){
        System.out.println("FootballCoach: inside of doMyStartUpStuff");
    }
    
    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println("FootballCoach: inside of doMyCleanUpStuff");
    }
    
}
