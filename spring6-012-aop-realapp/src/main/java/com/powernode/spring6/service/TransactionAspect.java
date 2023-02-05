package com.powernode.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Author iyeee
 * @Date 2023/2/5 22:50
 * @Version 1.0.1
 */
@Component
@Aspect
public class TransactionAspect {
    // 编程式事物
    @Around("execution(* com.powernode.spring6.service..*(..))")
    public void aroundAdvice(ProceedingJoinPoint joinPoint){
        try {
            // 前环绕
            System.out.println("开启事物");
            // 执行目标
            joinPoint.proceed();
            // 后环绕
            System.out.println("提交事务");
        } catch (Throwable e) {
            System.out.println("回滚事务");
        }
    }
}
