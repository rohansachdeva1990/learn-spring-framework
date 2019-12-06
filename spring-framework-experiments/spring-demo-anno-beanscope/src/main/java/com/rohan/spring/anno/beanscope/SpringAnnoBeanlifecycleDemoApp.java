package com.rohan.spring.anno.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohan.spring.anno.beanscope.coach.Coach;

public class SpringAnnoBeanlifecycleDemoApp {

    public static void main(String[] args) {

        // Load the spring configuration file; We can also have multiple
        // application context files. Scan for beans !!!
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach footballCoach = context.getBean("footballCoach", Coach.class);
        
        System.out.println(footballCoach.getDailyFortune());
        
        // Closing the context.
        context.close();
    }
}
