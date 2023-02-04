package com.powernode.proxy.util;

import com.powernode.proxy.service.TimerInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @Author iyeee
 * @Date 2023/2/5 2:40
 * @Version 1.0.1
 */
public class ProxyUtil {
    // 封装
    public static Object newProxyInstance(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),new TimerInvocationHandler(target));
    }

}
