package com.powernode.factory.method;

/**
 * @Author iyeee
 * @Date 2022/12/13 23:36
 * @Version 1.0.1
 */
public  class DaggerFactory extends WeapenFactory{
    @Override
    public Weapon get() {
        return new Dagger();
    }
}
