package com.powernode.spring6.bean2;

/**
 * @Author iyeee
 * @Date 2022/12/15 1:11
 * @Version 1.0.1
 */
public class Husband {
    private String name;
    private Wife wife;

    public Husband(String name, Wife wife) {
        this.name = name;
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
