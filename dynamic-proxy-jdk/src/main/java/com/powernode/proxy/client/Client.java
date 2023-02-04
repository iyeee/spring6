package com.powernode.proxy.client;

import com.powernode.proxy.service.OrderService;
import com.powernode.proxy.service.OrderServiceImpl;
import com.powernode.proxy.util.ProxyUtil;

/**
 * @Author iyeee
 * @Date 2023/2/5 1:39
 * @Version 1.0.1
 */
public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        OrderService orderService=new OrderServiceImpl();
        // 创建代理对象
        // 1.newProxyInstance 新建代理对象，也就是说 通过调用这个方法可以创建代理对象
        //         本质上做了两件事 1.动态得生成了一个代理类的字节码class 2.new对象，通过内存中生成的代理类实例化代理对象
        // 2.关于newProxyInstance()方法的三个重要的参数，每一个有什么含义，有什么用
        //                 1.ClassLoader loader 类加载器
        //                      在内存当中生成的字节码也是class文件，要执行也得先加载到内存中，加载类就需要类加载器，所以需要指定类加载器
        //                      并且jdk要求，目标类的累加器和代理类的类加载器使用同一个
        //                 2.Class<?>[] interfaces
        //                      代理类和目标类要实现同一个或者同一些接口，所以必须告诉
        //                 3.InvocationHandler h
        //                      调用处理器，是一个接口，在调用处理器中编写的，就是增强代码
        //                       这种调用处理器写一次就好
        // OrderService proxyInstance = (OrderService) Proxy.newProxyInstance(orderService.getClass().getClassLoader(),orderService.getClass().getInterfaces(),new TimerInvocationHandler(orderService));
        // 调用代理对象的代理方法
        OrderService proxyInstance =(OrderService)ProxyUtil.newProxyInstance(orderService);
        proxyInstance.generate();
        proxyInstance.modify();
        proxyInstance.detail();
        String name= proxyInstance.getName();
        System.out.println(name);
        Integer age=proxyInstance.getAge();
        System.out.println(age);
    }
}
