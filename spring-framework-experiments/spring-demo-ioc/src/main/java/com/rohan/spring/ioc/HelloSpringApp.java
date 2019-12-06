package com.rohan.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohan.spring.ioc.coach.Coach;

public class HelloSpringApp {
    public static void main(String[] args) {

        // Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from spring container
        
        /**
         * Why do we need to pass the Coach Interface in getBean()?
         * - When we pass the interface to the method, behind the scenes Spring will
         * cast object for us.
         * 
         * So, If we have an incorrect type of implementation, then this variant of
         * getBean() will throw BeanNotOfRequiredTypeException. It provides more type 
         * safety. While if we use getBean(String) then we need to explicitly cast the 
         * object returned and there is a possibility to get ClassCastException.
         */
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // Close the context
        context.close();
    }
}
