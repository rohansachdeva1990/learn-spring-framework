package com.rohan.spring.anno.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohan.spring.anno.di.coach.Coach;

public class SpringAnnoDemoApp {

    public static void main(String[] args) {

        // Load the spring configuration file; We can also have multiple
        // application context files. Scan for beans !!!
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach gymCoach = context.getBean("gymCoach", Coach.class);

        System.out.println(gymCoach.getDailyWorkout());
        
        System.out.println(gymCoach.getDailyFortune());
        
        // Closing the context.
        context.close();
    }
}
