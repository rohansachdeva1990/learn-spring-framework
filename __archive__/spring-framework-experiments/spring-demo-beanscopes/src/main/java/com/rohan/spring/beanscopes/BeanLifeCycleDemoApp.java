package com.rohan.spring.beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohan.spring.beanscopes.coach.Coach;

public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {

        // Load the spring configuration file; We can also have multiple
        // application context files.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println("Memory location for theCoach: " + theCoach);

        // Closing the context.
        context.close();
    }
}
