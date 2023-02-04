package com.powernode.proxy.client;

import com.powernode.proxy.service.TimerMethodInterceptor;
import com.powernode.proxy.service.UserService;
import net.sf.cglib.proxy.Enhancer;

/**
 * @Author iyeee
 * @Date 2023/2/5 2:55
 * @Version 1.0.1
 */
public class Client {
    public static void main(String[] args) {
        //创建字节码增强对象
        //这个对象时CGLIB库当中的核心对象，就是依靠它生成代理类
        Enhancer enhancer = new Enhancer();
        //告诉CGLIB，目标类是谁
        enhancer.setSuperclass(UserService.class);
        //设置回调 等于jdk动态代理中的调用处理器，invocationHandler
        // 方法拦截器接口，MethodInterceptor
        enhancer.setCallback(new TimerMethodInterceptor());
        //创建代理对象 1.在内存生成UserService类的子类，其实就是代理类的字节码 2.创建代理对象
        // 父类是UserService，子类一定是UserService
        UserService userService = (UserService) enhancer.create();
        // com.powernode.proxy.service.UserService$$EnhancerByCGLIB$$82cb55e3@31b7dea0
        System.out.println(userService);
        // 调用代理对象的代理方法
        boolean success = userService.login("admin", "123");
        System.out.println(success);
        userService.logout();
    }
}
