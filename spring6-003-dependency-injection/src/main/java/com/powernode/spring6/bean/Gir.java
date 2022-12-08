package com.powernode.spring6.bean;

/**
 * @Author iyeee
 * @Date 2022/12/8 21:13
 * @Version 1.0.1
 */
public class Gir {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gir{" +
                "name='" + name + '\'' +
                '}';
    }
}
