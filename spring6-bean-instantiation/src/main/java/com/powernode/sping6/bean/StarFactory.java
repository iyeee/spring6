package com.powernode.sping6.bean;

/**
 * 简单工厂模式中的工厂类
 * @Author iyeee
 * @Date 2022/12/14 0:14
 * @Version 1.0.1
 */
public class StarFactory {
//    工厂类中有一个静态方法
//    简单工厂模式又叫：静态工厂方法模式
    public static Star get(){
//        这个star对象最终实际上创建的时候还是我们负责new的对象
        return new Star();
    }
}
