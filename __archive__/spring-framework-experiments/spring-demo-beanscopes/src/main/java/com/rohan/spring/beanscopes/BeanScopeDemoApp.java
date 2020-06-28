package com.rohan.spring.beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohan.spring.beanscopes.coach.Coach;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        // Load the spring configuration file; We can also have multiple
        // application context files.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // Check if they are the same bean
        boolean result = (theCoach == alphaCoach);

        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

        // Closing the context.
        context.close();
    }
}
