package com.rohan.spring.anno.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohan.spring.anno.di.coach.Coach;

public class SpringAnnoSetterDemoApp {

    public static void main(String[] args) {

        // Load the spring configuration file; We can also have multiple
        // application context files. Scan for beans !!!
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());

        
        Coach cricketCoach = context.getBean("cricketCoach", Coach.class);

        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());
        
        // Closing the context.
        context.close();
    }
}
