package com.rohan.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohan.spring.di.coach.impl.GymCoach;

/**
 * This example shows how to use literal injection.
 * 
 * @author rohan
 *
 */
public class SetterLiteralsDemoApp {

    public static void main(String args[]) {

        // Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from spring container
        /**
         * Why do we need to pass the Coach Interface in getBean()? - When we
         * pass the interface to the method, behind the scenes Spring will cast
         * object for us.
         * 
         * So, If we have an incorrect type of implementation, then this variant
         * of getBean() will throw BeanNotOfRequiredTypeException. It provides
         * more type safety. While if we use getBean(String) then we need to
         * explicitly cast the object returned and there is a possibility to get
         * ClassCastException.
         */
        GymCoach gymCoach = context.getBean("myGymCoach", GymCoach.class);

        /**
         * Our coach will be fully assembled by the type of fortune service.
         */
        // Call methods on the bean
        System.out.println(gymCoach.getDailyWorkout());
        System.out.println(gymCoach.getDailyFortune());
        System.out.println(gymCoach.getTeam());
        System.out.println(gymCoach.getEmail());

        // Close the context
        context.close();
    }
}
