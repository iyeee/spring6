package com.powernode.spring6.bean;

/**
 * @Author iyeee
 * @Date 2022/12/9 14:41
 * @Version 1.0.1
 */
public class People {
    private String name;
    private int age;
    private boolean sex;

    public People(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
//c命名空间注入，是简化构造方法注入
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
