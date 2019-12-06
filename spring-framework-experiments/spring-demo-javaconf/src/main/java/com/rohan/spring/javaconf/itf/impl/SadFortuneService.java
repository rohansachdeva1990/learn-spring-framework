package com.rohan.spring.javaconf.itf.impl;

import com.rohan.spring.javaconf.itf.FortuneService;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Why so serious !!";
    }

}
