package com.atguigu.spring.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAop {

    @Pointcut("execution(* com.atguigu.spring.aopanno.*.*(..))")
    public void pointCut(){

    }

    @Before("execution(* com.atguigu.spring.aopanno.*.*(..))")
    public void before(){
        System.out.println("Before execute...");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("After execute...");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint process) throws Throwable {
        System.out.println("Before around...");
        Object proceed = process.proceed();
        System.out.println("After around...");


    }
    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("AfterReturning execute...");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("AfterThrowing execute...");
    }


}
