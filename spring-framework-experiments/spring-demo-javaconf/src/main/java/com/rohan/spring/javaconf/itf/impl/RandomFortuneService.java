package com.rohan.spring.javaconf.itf.impl;

import org.springframework.stereotype.Component;

import com.rohan.spring.javaconf.itf.FortuneService;

@Component
public class RandomFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "";
    }

}
