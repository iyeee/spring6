package com.powernode.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * bean的生命周期按照五步的话
 * 第一步：实例化bean（调用无参构造函数）
 * 第二步：给bean属性赋值（调用set方法）
 * 第三步：初始化bean(会调用bean的init方法，注意这个init方法需要自己写，自己配)
 * 第四步：使用Bean
 * 第五步：销毁bean（会调用bean的destroy，注意：这个destroy方法需要自己写，自己配）
 * @Author iyeee
 * @Date 2022/12/14 23:18
 * @Version 1.0.1
 */
public class User implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean,DisposableBean{
    public User() {
        System.out.println("第一步：无参构造函数执行");
    }
    private String name;

    public void setName(String name) {
        System.out.println("第二步：给对象的属性赋值");
        this.name = name;
    }
//    这个bean需要自己写自己配，方法名随意
    public  void initBean(){
        System.out.println("第三步：初始化bean");
    }
//    这个bean需要自己写自己配，方法名随意
    public void destroyBean(){
        System.out.println("第五步：销毁bean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("Bean这个类的加载器"+classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("生产这个bean的工厂对象是："+beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("这个bean对象的名字是："+name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean's afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean's destroy方法执行");
    }
}
