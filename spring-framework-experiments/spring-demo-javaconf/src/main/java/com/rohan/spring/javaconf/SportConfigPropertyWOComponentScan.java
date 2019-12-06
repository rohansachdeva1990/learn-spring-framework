package com.rohan.spring.javaconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.rohan.spring.javaconf.itf.Coach;
import com.rohan.spring.javaconf.itf.FortuneService;
import com.rohan.spring.javaconf.itf.impl.HockeyCoach;
import com.rohan.spring.javaconf.itf.impl.SadFortuneService;


@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfigPropertyWOComponentScan {
    
    // Add support to resolve ${...}
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
    
    // define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }
    
    // define bean for the swim coach and inject dependency
    @Bean
    public Coach hockeyCoach(){
        return new HockeyCoach(sadFortuneService());
    }
}
