package com.rohan.spring.javaconf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohan.spring.javaconf.itf.Coach;

public class SpringJavaConfDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach footballCoach = context.getBean("footballCoach", Coach.class);
        System.out.println(footballCoach.getDailyFortune());

        // Closing the context.
        context.close();
        
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(SportConfigWithoutComponentScan.class);
        Coach swimCoach = context2.getBean("swimCoach", Coach.class);
        System.out.println(swimCoach.getDailyFortune());
        System.out.println(swimCoach.getDailyWorkout());
        
        // Closing the context.
        context2.close();
    }
}
