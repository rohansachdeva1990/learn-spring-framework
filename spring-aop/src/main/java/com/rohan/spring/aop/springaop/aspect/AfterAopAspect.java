package com.rohan.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class AfterAopAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(
            value = "com.rohan.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()",
            returning = "result" // Name of the arg
    )
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info("{} returned with value {}", joinPoint, result);
    }

    @AfterThrowing(
            value = "com.rohan.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()",
            throwing = "exception" // Name of the arg
    )
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
        logger.info("{} throw exception {}", joinPoint, exception);
    }

    @After(
            value = "com.rohan.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()"
    )
    public void after(JoinPoint joinPoint) {
        logger.info("after execution of {}", joinPoint);
    }
}
