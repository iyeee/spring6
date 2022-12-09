package com.powernode.spring6.bean;

/**
 * @Author iyeee
 * @Date 2022/12/9 0:59
 * @Version 1.0.1
 */
public class Cat {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
