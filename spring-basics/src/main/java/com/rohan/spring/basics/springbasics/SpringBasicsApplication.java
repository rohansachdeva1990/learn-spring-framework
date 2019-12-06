package com.rohan.spring.basics.springbasics;

import com.rohan.spring.basics.springbasics.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
// 1
@SpringBootApplication
public class SpringBasicsApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);



        int result = binarySearch.binarySearch(new int[]{12, 3, 4}, 3);
        System.out.println(result);
    }

}
