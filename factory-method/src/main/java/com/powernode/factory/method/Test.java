package com.powernode.factory.method;

/**
 * @Author iyeee
 * @Date 2022/12/13 23:41
 * @Version 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        WeapenFactory daggerFactory=new DaggerFactory();
        Weapon weapon = daggerFactory.get();
        weapon.attack();
        WeapenFactory gunFactory = new GunFactory();
        Weapon weapon1 = gunFactory.get();
        weapon1.attack();
    }
}
