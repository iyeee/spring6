package com.powernode.spring6.bean3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author iyeee
 * @Date 2023/2/3 16:08
 * @Version 1.0.1
 */
@Component
public class User {
    // @Value 也可以用在set方法和构造方法
    // @Value("tom")
    private String name;
    private int age;

    // public void setName(String name) {
    //     this.name = name;
    // }
    //
    // @Value("30")
    // public void setAge(int age) {
    //     this.age = age;
    // }

    public User(@Value("tony")String name,@Value("77") int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
