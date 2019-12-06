package com.rohan.spring.javaconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rohan.spring.javaconf.itf.Coach;
import com.rohan.spring.javaconf.itf.FortuneService;
import com.rohan.spring.javaconf.itf.impl.SadFortuneService;
import com.rohan.spring.javaconf.itf.impl.SwimCoach;

/**
 * 
 * In this configuration we are manually configuring the beans that we want to be 
 * activated in our app. Its exactly the same we have been doing in the XML and
 * Annotation way. So, we are just adding the beans here by using @Bean.
 * 
 * @author rohan
 *
 */

@Configuration
public class SportConfigWithoutComponentScan {
    
    // define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }
    
    // define bean for the swim coach and inject dependency
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}
