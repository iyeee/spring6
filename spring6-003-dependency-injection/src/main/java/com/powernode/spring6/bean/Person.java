package com.powernode.spring6.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author iyeee
 * @Date 2022/12/9 0:36
 * @Version 1.0.1
 */
public class Person {
//    注入list集合
    private List<String> names;
//    注入set集合
    private Set<String> address;

    private Map<Integer,String> phones;

//    注入属性类对象
//    本质是一个map集合，properties父类是hashtable实现了map接口
    private Properties properties;

    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", address=" + address +
                ", phones=" + phones +
                ", properties=" + properties +
                '}';
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setPhones(Map<Integer, String> phones) {
        this.phones = phones;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

}
