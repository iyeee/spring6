package com.powernode.spring6.bean;

import java.util.Date;

/**
 * @Author iyeee
 * @Date 2022/12/9 14:28
 * @Version 1.0.1
 */
public class Dog {
    private String name;
    private int age;
    private Date birth;
//  p命名空间注入，底层还是set注入
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                '}';
    }
}
