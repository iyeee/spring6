package com.powernode.simple.factory;

/**
 * @Author iyeee
 * @Date 2022/12/13 22:49
 * @Version 1.0.1
 */
public class WeapenFactory {
    /**
     * 静态方法。
     * 要获取什么产品，就看你传什么参数，TANK获取坦克
     * 简单工厂模式中有一个静态方法，所以被称为静态工厂方法
     * @param weaponType
     * @return
     */
    public static Weapen get(String weaponType){
        if ("TANK".equals(weaponType)){
            return new Tank();
        }else if("DAGGER".equals(weaponType)){
            return new Dagger();
        }else if("FIGHTER".equals(weaponType)){
            return  new Fighter();
        }else {
             throw  new RuntimeException("不支持");
        }
    }
}
