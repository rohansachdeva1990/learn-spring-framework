package com.rohan.spring.anno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohan.spring.anno.coach.Coach;

public class SpringAnnoDemoApp {

    public static void main(String[] args) {

        // Load the spring configuration file; We can also have multiple
        // application context files. Scan for beans !!!
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("theSillyCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        Coach gymCoach = context.getBean("gymCoach", Coach.class);
        System.out.println(gymCoach.getDailyWorkout());

        // Closing the context.
        context.close();
    }
}
