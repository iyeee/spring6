package com.powernode.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author iyeee
 * @Date 2022/12/27 13:29
 * @Version 1.0.1
 */
public class Test4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        String className="com.powernode.reflect.User";
        String propertyName="age";
        Class<?> aClass = Class.forName(className);
        String setMethodName="set"+propertyName.toUpperCase().charAt(0)+propertyName.substring(1);
        Method declaredMethod = aClass.getDeclaredMethod(setMethodName, int.class);
        Object o = aClass.newInstance();
        declaredMethod.invoke(o,30);
        System.out.println(o);

    }
}
