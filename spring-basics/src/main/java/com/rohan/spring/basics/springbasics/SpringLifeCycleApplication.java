package com.rohan.spring.basics.springbasics;


import com.rohan.spring.basics.springbasics.lifecycle.SomeSearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

// 4
@SpringBootApplication
@ComponentScan("com.rohan.spring.basics.springbasics.lifecycle")
public class SpringLifeCycleApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringLifeCycleApplication.class, args);
        SomeSearchImpl someSearch = applicationContext.getBean(SomeSearchImpl.class);
        int result = someSearch.search(new int[]{12, 3, 4}, 3);
        System.out.println(result);
    }

}
