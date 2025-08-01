package com.MyCofeeMachine;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    @Before("execution(* com.MyCofeeMachine.CafeService.*(..))")
public void logBefore() {
    System.out.println("LoggerAspect: Brewing begins");
}

@After("execution(* com.MyCofeeMachine.CafeService.*(..))")
public void logAfter() {
    System.out.println("LoggerAspect: Brewing done");
}


}

