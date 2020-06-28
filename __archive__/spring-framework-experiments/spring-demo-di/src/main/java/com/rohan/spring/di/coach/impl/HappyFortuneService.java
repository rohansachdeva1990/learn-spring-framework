package com.rohan.spring.di.coach.impl;

import com.rohan.spring.di.coach.FortuneService;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

}
