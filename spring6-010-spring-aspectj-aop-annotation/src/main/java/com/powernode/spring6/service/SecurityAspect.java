package com.powernode.spring6.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author iyeee
 * @Date 2023/2/5 22:06
 * @Version 1.0.1
 */
@Aspect
@Component
@Order(1)
public class SecurityAspect {
    @Before("com.powernode.spring6.service.LogAspect.universalPoints()")
    public void beforeAdvice(){
        System.out.println("安全 前置通知");
    }
}
