package com.powernode.spring6.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author iyeee
 * @Date 2023/2/5 20:37
 * @Version 1.0.1
 */
//  切面=通知+切点
// 切面类是需要使用@Aspect注解进行标注的
@Aspect
@Component
@Order(2)
public class LogAspect {
    //通知就是增强
    //这里Advice以方法的形式出现


    // 定义通用的切点表达式
    @Pointcut("execution(* com.powernode.spring6.service..*(..))")
    public void universalPoints(){
        //这个方法只是一个标记，方法名随意，方法体中也不需要任何代码
    }

    // @Before() //前置通知
    @Before("universalPoints()")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("前置通知");
        // joinPoint,在spring容器调用这个方法的时候自动传过来
        // 获取目标方法的签名 可以获取到方法的具体信息
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName());
    }
    // 后置通知
    @AfterReturning("universalPoints()")
    public void afterReturnAdvice(){
        System.out.println("后置通知");
    }
    // 环绕是最大的范围，在前置通知之前，后置通知之后
    @Around("universalPoints()")
    public void aroundReturnAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        //前面的代码
        System.out.println("环绕前");
        //执行目标
        joinPoint.proceed();
        //后面的代码
        System.out.println("环绕后");
    }
    // 最终通知
    @After("execution(* com.powernode.spring6.service..*(..))")
    public void afterAdvice() {
        System.out.println("最终通知");
    }

    // 异常通知
    @AfterThrowing("execution(* com.powernode.spring6.service..*(..))")
    public void afterThrowingAdvice()  {
        System.out.println("异常通知");
    }
}
