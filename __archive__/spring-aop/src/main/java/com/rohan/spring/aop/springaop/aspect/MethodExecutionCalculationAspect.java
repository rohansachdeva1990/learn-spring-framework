package com.rohan.spring.aop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //   value = "execution(* com.rohan.spring.aop.springaop.business.*.*(..))"
    @Around("com.rohan.spring.aop.springaop.aspect.CommonJoinPointConfig.trackTimeAnn()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        // General idea
        // starttime = x
        // allow execution of method
        // end time = y
        long startTimeInMs = System.currentTimeMillis();
        joinPoint.proceed();

        long timeTakenInMs = System.currentTimeMillis() - startTimeInMs;

        logger.info("The time taken by {} is {} ms", joinPoint, timeTakenInMs);
    }

}
