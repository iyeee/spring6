package com.powernode.spring6.bean;

/**
 * @Author iyeee
 * @Date 2023/2/6 21:28
 * @Version 1.0.1
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;
    private Singleton(){}

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return  uniqueInstance;
    }
}
