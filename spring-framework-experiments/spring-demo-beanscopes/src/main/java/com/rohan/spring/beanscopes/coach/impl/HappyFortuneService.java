package com.rohan.spring.beanscopes.coach.impl;

import com.rohan.spring.beanscopes.coach.FortuneService;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

}
