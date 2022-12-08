package com.powernode.spring6.bean;

/**
 * @Author iyeee
 * @Date 2022/12/8 20:39
 * @Version 1.0.1
 */
public class Student {
    private String name;
    private Clazz clazz;
    public void setName(String name) {
        this.name = name;
    }
    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clazz=" + clazz +
                '}';
    }

    public String getName() {
        return name;
    }

    public Clazz getClazz() {
        return clazz;
    }
}
