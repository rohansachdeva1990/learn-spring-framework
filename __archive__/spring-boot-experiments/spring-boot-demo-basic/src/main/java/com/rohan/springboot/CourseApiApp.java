package com.rohan.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// Tells spring boot, that this is the starting point for our application
@SpringBootApplication
public class CourseApiApp {
	
	
	/*
	 * Here the args, are sent from one main method to our spring application
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);
	}
}
