package com.powernode.client;

import com.powernode.annotation.Component;

import java.lang.reflect.Field;

/**
 * @Author iyeee
 * @Date 2022/12/27 22:30
 * @Version 1.0.1
 */
public class ReflectAnnotationTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        //通过反射机制怎么读取注解
        Class<?> aClass = Class.forName("com.powernode.bean.User");
        //判断类上面有没有注解
        if(aClass.isAnnotationPresent(Component.class)){
            //获取类上面的注解
            Component annotation = aClass.getAnnotation(Component.class);
            //访问注解属性
            System.out.println(annotation.value());


        }

        Field name = aClass.getDeclaredField("name");
        boolean annotationPresent = name.isAnnotationPresent(Component.class);
        if (annotationPresent){
            Component annotation = name.getAnnotation(Component.class);
            System.out.println(annotation.value());
        }
    }
}
