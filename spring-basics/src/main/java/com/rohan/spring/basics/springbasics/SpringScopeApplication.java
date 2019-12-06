package com.rohan.spring.basics.springbasics;

import com.rohan.spring.basics.springbasics.scope.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// 2
@SpringBootApplication
public class SpringScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringScopeApplication.class, args);

        PersonDao personDao = applicationContext.getBean(PersonDao.class);
        PersonDao personDao2 = applicationContext.getBean(PersonDao.class);

        LOGGER.info("{}", personDao);
        LOGGER.info("{}", personDao.getJdbcConnection());

        LOGGER.info("{}", personDao2);
        LOGGER.info("{}", personDao2.getJdbcConnection());
    }

}
