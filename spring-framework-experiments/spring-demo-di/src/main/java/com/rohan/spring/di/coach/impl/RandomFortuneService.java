package com.rohan.spring.di.coach.impl;

import java.util.Random;

import com.rohan.spring.di.coach.FortuneService;

public class RandomFortuneService implements FortuneService {

    private static final String fortunes[] = { "Yes we can", "Believe in your self", "Have a great day" };

    @Override
    public String getFortune() {
        return fortunes[new Random().nextInt(fortunes.length)];
    }
}
