package com.powernode.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author iyeee
 * @Date 2022/12/27 22:05
 * @Version 1.0.1
 */
//标注注解的注解，叫做元注解，@Target（）注解用来修饰@Component可以出现的位置
//以下表示@Component注解可以出现在类上，属性上
// @Target(value = {ElementType.TYPE,ElementType.FIELD})
// 使用某个注解的时候，如果注解的属性名是value，value可以省略
// 若是数组，且只有一个元素，大括号可以省略
// @Target({ElementType.TYPE,ElementType.FIELD})
@Target({ElementType.TYPE,ElementType.FIELD})
// 用来标注@Component注解最终保留在class文件中，并且可以被反射机制读取
// RUNTIME,CLASS,SOURCE只保留源文件中
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
    // 定义注解的属性
    // String是属性类型
    // value是属性名
    String value();
    // 定义注解的属性
    // String是属性类型
    // name是属性名
    // String name();
    // 定义注解的属性
    // String[]是属性类型
    // names是属性名
    // String[] names();
    // int[] ages();
    // int age();
}
