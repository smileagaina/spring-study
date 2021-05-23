package com.shj.diy;


//方式三： 使用注解来实现AOP

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {


    @Before("execution(* com.shj.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("方法执行前");
    }


    @After("execution(* com.shj.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("方法执行之后");
    }


    @Around("execution(* com.shj.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Object proceed = jp.proceed();
        System.out.println("环绕后");
    }
}
