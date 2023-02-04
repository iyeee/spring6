package com.powernode.proxy.service;

/**
 * @Author iyeee
 * @Date 2023/2/5 1:02
 * @Version 1.0.1
 */
// 代理对象和目标对象具有相同的行为，就要实现同一个或一些接口
// 客户端在使用代理对象的时候需要在使用目标对象一样
public class OrderServiceProxy implements OrderService {
    // 关联关系，比继承关系的耦合度低
    // 代理对象中含有目标对象的引用 关联关系 is a
    // 不能写OrderServiceImpl，写一个公共接口类型，公共接口耦合度低
    private OrderService orderService;

    // 创建代理对象的时候，创建一个目标对象给代理对象
    // java支持多态，动态绑定机制
    public OrderServiceProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void generate() {
        long begin=System.currentTimeMillis();
        orderService.generate();
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-begin));
    }

    @Override
    public void modify() {
        orderService.modify();
    }

    @Override
    public void detail() {
        orderService.detail();
    }
}
