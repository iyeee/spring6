package com.powernode.proxy.client;

import com.powernode.proxy.service.OrderService;
import com.powernode.proxy.service.OrderServiceImpl;
import com.powernode.proxy.service.OrderServiceProxy;

/**
 * @Author iyeee
 * @Date 2023/2/5 0:35
 * @Version 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        // OrderService service=new OrderServiceImpl();
        // service.generate();
        // service.modify();
        // service.detail();
        //创建目标对象
        OrderService service=new OrderServiceImpl();
        //创建代理对象
        OrderServiceProxy orderServiceProxy=new OrderServiceProxy(service);
        //调用代理对象的代理方法
        orderServiceProxy.generate();
        orderServiceProxy.modify();
        orderServiceProxy.detail();
    }
}
