package com.powernode.proxy.service;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author iyeee
 * @Date 2023/2/5 3:03
 * @Version 1.0.1
 */
public class TimerMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long begin=System.currentTimeMillis();
        Object retValue = methodProxy.invokeSuper(o, objects);
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-begin));
        return retValue;
    }
}
