package com.rohan.spring.basics.springbasics.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named // Instead of Component
public class SomeCdiBusiness {

    @Inject // Instead of @Autowired
    private SomeCdiDao someCdiDao;

    public SomeCdiDao getSomeCdiDao() {
        return someCdiDao;
    }

    public void setSomeCdiDao(SomeCdiDao someCdiDao) {
        this.someCdiDao = someCdiDao;
    }

    public int findGreatest() {
        int greatest = Integer.MIN_VALUE;
        int[] data = someCdiDao.getData();
        for (int value : data) {
            if (value > greatest) {
                greatest = value;
            }
        }
        return greatest;
    }
}
