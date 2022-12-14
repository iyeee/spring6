package com.powernode.sping6.bean;

/**
 * 工厂方法模式中的具体工厂
 * @Author iyeee
 * @Date 2022/12/14 0:26
 * @Version 1.0.1
 */
public class GunFactory {
//    工厂方法模式中的具体工厂角色中的方法是：实例方法
    public Gun get(){
//        实际上new这个对象还是我们程序自己new的，
        return new Gun();
    }
}
