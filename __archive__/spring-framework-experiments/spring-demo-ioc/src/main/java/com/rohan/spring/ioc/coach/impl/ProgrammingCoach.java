package com.rohan.spring.ioc.coach.impl;

import com.rohan.spring.ioc.coach.Coach;

public class ProgrammingCoach implements Coach {

	/* (non-Javadoc)
     * @see com.rohan.spring.ioc.Coach#getDailyWorkout()
     */
	@Override
    public String getDailyWorkout() {
		return "Practice 5 Algorithms questions a day";
	}
}
