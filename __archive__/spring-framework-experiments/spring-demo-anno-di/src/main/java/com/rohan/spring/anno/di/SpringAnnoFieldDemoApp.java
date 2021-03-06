package com.rohan.spring.anno.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohan.spring.anno.di.coach.impl.FootballCoach;

public class SpringAnnoFieldDemoApp {

    public static void main(String[] args) {

        // Load the spring configuration file; We can also have multiple
        // application context files. Scan for beans !!!
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        FootballCoach footballCoach = context.getBean("footballCoach", FootballCoach.class);

        System.out.println(footballCoach.getDailyWorkout());
        System.out.println(footballCoach.getDailyFortune());

        // Closing the context.
        context.close();
    }
}
