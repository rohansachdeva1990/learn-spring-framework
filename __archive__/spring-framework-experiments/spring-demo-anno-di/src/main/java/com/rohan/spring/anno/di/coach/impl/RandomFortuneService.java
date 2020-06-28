package com.rohan.spring.anno.di.coach.impl;

import org.springframework.stereotype.Component;

import com.rohan.spring.anno.di.coach.FortuneService;

@Component
public class RandomFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "";
    }

}
