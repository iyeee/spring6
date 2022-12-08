package com.powernode.spring6.bean;

/**
 * @Author iyeee
 * @Date 2022/12/8 17:44
 * @Version 1.0.1
 */
public class User {
    private String name; //String是简单类型
    private String password;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

}
