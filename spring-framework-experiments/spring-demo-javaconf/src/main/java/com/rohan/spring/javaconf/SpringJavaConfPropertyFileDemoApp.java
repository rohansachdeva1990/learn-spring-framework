package com.rohan.spring.javaconf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohan.spring.javaconf.itf.impl.HockeyCoach;

public class SpringJavaConfPropertyFileDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfigPropertyWOComponentScan.class);

        HockeyCoach hockeyCoach = context.getBean("hockeyCoach", HockeyCoach.class);
        System.out.println(hockeyCoach.getDailyFortune());
        System.out.println(hockeyCoach.getDailyWorkout());
        System.out.println(hockeyCoach.getEmail());
        System.out.println(hockeyCoach.getTeam());

        // Closing the context.
        context.close();
    }
}
