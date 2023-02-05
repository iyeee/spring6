package com.powernode.spring6.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author iyeee
 * @Date 2023/2/5 23:19
 * @Version 1.0.1
 */
@Component
@Aspect
public class SecurityAspect {
    @Pointcut("execution(* com.powernode.spring6.biz..save*(..))")
    public void savePointCut(){
    }
    @Pointcut("execution(* com.powernode.spring6.biz..modify*(..))")
    public void modifyPointCut(){
    }
    @Pointcut("execution(* com.powernode.spring6.biz..delete*(..))")
    public void deletePointCut(){
    }
    @Before("savePointCut()||modifyPointCut()||deletePointCut()")
    public void beforeAdvice(JoinPoint joinPoint){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTime = simpleDateFormat.format(new Date());
        System.out.println(nowTime+"zs:"+joinPoint.getSignature().getDeclaringTypeName()+"  "+joinPoint.getSignature().getName());

    }
}
