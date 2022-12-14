package com.powernode.spring6.bean;

/**
 * @Author iyeee
 * @Date 2022/12/15 1:11
 * @Version 1.0.1
 */
public class Husband {
    private String name;
    private Wife wife;

    public void setName(String name) {
        this.name = name;
    }
    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", wife=" + wife.getName() +
                '}';
    }
}
