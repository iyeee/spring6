package com.powernode.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Author iyeee
 * @Date 2022/12/15 2:42
 * @Version 1.0.1
 */
public class Test2 {
    public static void main(String[] args) throws Exception{
        // 使用反射机制怎么调用
        // 获取类
        Class<?> aClass = Class.forName("com.powernode.reflect.SomeServices");

        // 获取方法
        Method doSome = aClass.getDeclaredMethod("doSome");
        Method doSome1 = aClass.getDeclaredMethod("doSome", String.class);
        Method doSome2 = aClass.getDeclaredMethod("doSome", String.class,int.class);

        // 调用方法
        // 调用哪个对象的哪个方法，传什么参数，返回什么值
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        Object o = declaredConstructor.newInstance();
        Object invoke = doSome.invoke(o);
        System.out.println(invoke);
        Object ad = doSome1.invoke(o, "ad");
        System.out.println(ad);
        Object add = doSome2.invoke(o, "add", 1);
        System.out.println(add);


    }
}
