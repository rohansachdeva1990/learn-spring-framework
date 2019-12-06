package com.rohan.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// Related to aop
// Configuration
@Aspect
@Configuration
public class UserAccessAspect {

    // What kind of method calls I would intercept
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //@Before("execution(* com.rohan.spring.aop.springaop..*.*(..))") m - Logs will be
    // This is Point cut
    //@Before("execution(* com.rohan.spring.aop.springaop.data.*.*(..))")

    @Before("com.rohan.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
    public void before(JoinPoint joinPoint) { //

        //Advice : what do we want to do.
        logger.info(" Check for user access");
        logger.info(" Allowed execution for {}", joinPoint);

    }
}
