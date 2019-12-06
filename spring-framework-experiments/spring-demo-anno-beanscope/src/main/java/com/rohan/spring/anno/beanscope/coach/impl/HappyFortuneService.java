package com.rohan.spring.anno.beanscope.coach.impl;

import org.springframework.stereotype.Component;

import com.rohan.spring.anno.beanscope.coach.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

}
