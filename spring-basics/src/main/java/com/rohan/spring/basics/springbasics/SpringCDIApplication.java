package com.rohan.spring.basics.springbasics;

import com.rohan.spring.basics.springbasics.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// 5
@SpringBootApplication
public class SpringCDIApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringCDIApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringCDIApplication.class, args);
        SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

        LOGGER.info("{} dao {}", business, business.getSomeCdiDao());
    }

}
