package com.rohan.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Best practice is to have separate file having the point cuts defined and used them accordinlgly in
 * the places required.
 */
public class CommonJoinPointConfig {

    @Pointcut("execution(* com.rohan.spring.aop.springaop.data.*.*(..))")
    public void dataLayerExecution() {
    }

    @Pointcut("execution(* com.rohan.spring.aop.springaop.business.*.*(..))")
    public void businessLayerExecution() {
    }


    @Pointcut("com.rohan.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() &&" +
            "com.rohan.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void allLayerExecution() {
    }

    // Use regex
    @Pointcut("bean(dao*)")
    public void beanStartingWithDao() {
    }

    // Executing all the calls within a layer; you don't need * in starting
    @Pointcut("within(com.rohan.spring.aop.springaop.data..*)")
    public void dataLayerExecutionWithWithin() {
    }

    // Using annotation; Methods which are annotated with these annotation will be tracked.
    @Pointcut("@annotation(com.rohan.spring.aop.springaop.aspect.TrackTime)")
    public void trackTimeAnn() {
    }
}
