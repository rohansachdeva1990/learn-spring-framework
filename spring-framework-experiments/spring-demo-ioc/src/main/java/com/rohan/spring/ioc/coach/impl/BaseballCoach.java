package com.rohan.spring.ioc.coach.impl;

import com.rohan.spring.ioc.coach.Coach;

public class BaseballCoach implements Coach {

	/* (non-Javadoc)
     * @see com.rohan.spring.ioc.Coach#getDailyWorkout()
     */
	@Override
    public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
}
