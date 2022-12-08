package com.powernode.spring6.bean;

/**
 * @Author iyeee
 * @Date 2022/12/8 20:37
 * @Version 1.0.1
 */
public class Clazz {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "name='" + name + '\'' +
                '}';
    }
}
