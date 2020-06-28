package com.rohan.spring.anno.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohan.spring.anno.beanscope.coach.Coach;

public class SpringAnnoBeanscopeDemoApp {

    public static void main(String[] args) {

        // Load the spring configuration file; We can also have multiple
        // application context files. Scan for beans !!!
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach gymCoach = context.getBean("gymCoach", Coach.class);
        Coach alphaCoach = context.getBean("gymCoach", Coach.class);
        
        // Check if they are the same bean
        boolean result = (gymCoach == alphaCoach);

        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for gymCoach: " + gymCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
        
        // Closing the context.
        context.close();
    }
}
