package com.rohan.springcore.cdi;

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
}
