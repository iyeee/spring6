package com.powernode.sping6.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author iyeee
 * @Date 2022/12/14 22:31
 * @Version 1.0.1
 */
//PersonFactoryBean也是一个bean，只不过这个bean比较特殊，叫做工厂bean
//通过工厂bea这个特殊bean可以获取普通的bean
public class PersonFactoryBean implements FactoryBean<Person> {
    @Override
    public boolean isSingleton() {
//        默认返回true
        return FactoryBean.super.isSingleton();
    }

    @Override
    public Person getObject() throws Exception {
//      最终这个bean的创建还是程序员自己new的
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
//
        return null;
    }
}
