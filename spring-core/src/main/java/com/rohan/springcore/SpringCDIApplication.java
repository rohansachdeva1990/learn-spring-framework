package com.rohan.springcore;


import com.rohan.springcore.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class SpringCDIApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringCDIApplication.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringCDIApplication.class);
        SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

        LOGGER.info("{} dao {}", business, business.getSomeCdiDao());
        applicationContext.close();
    }

}
