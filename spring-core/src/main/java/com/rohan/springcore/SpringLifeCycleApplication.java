package com.rohan.springcore;


import com.rohan.springcore.lifecycle.SomeSearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringLifeCycleApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringLifeCycleApplication.class);
        SomeSearchImpl someSearch = applicationContext.getBean(SomeSearchImpl.class);
        int result = someSearch.search(new int[]{12, 3, 4}, 3);
        System.out.println(result);
        applicationContext.close();
    }

}
