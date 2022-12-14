package com.powernode.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Author iyeee
 * @Date 2022/12/15 3:00
 * @Version 1.0.1
 */
public class Test3 {
    public static void main(String[] args) throws Exception{
        Class<?> aClass=Class.forName("com.powernode.reflect.SomeServices");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        Object o = declaredConstructor.newInstance();
        Method doSome = aClass.getDeclaredMethod("doSome", String.class, int.class);
        Object asdd = doSome.invoke(o, "asdd", 2);
        System.out.println(asdd);
    }

}
