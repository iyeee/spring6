package com.powernode.proxy.service;

/**
 * @Author iyeee
 * @Date 2023/2/5 0:31
 * @Version 1.0.1
 */
public class OrderServiceImpl implements OrderService{
    /**
     * 提出一个新需求，要统计所有业务接口中每一个业务方法的耗时
     * 1.解决方案一，硬编码，在每一个业务接口中的每一个业务方法中直接添加耗时的程序
     *         缺点一：违背ocp原则
     *         缺点二：代码没有得到复用（相同的代码写了很多遍）
     * 2.解决方案二
     * 编写业务类的子类，让子类继承业务类，对每个业务进行重写
     *          缺点一：耦合度很高，采用了继承关系，继承关系是一种耦合度非常高的关系，不建议使用
     *          缺点二：代码没有得到复用
     * 3.解决方案方案三
     * 代码模式
     *          优点一：解决了ocp问题
     *          优点二：降低耦合性，has a
     *          缺点一：一个接口需要一个代理类，类爆炸——————>使用动态代理，使用字节码生成技术，可以在内存中为我们动态的生成一个class字节码
     *          这个字节码就是代理类
     */
    @Override
    public void generate() {
        // long start=System.currentTimeMillis();
        try {
            Thread.sleep(1234);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("已生成");
        // long end=System.currentTimeMillis();
        // System.out.println("耗时："+(end-start));
    }

    @Override
    public void modify() {
        // long start=System.currentTimeMillis();
        try {
            Thread.sleep(456);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("已修改");
        // long end=System.currentTimeMillis();
        // System.out.println("耗时："+(end-start));
    }

    @Override
    public void detail() {
        // long start=System.currentTimeMillis();
        try {
            Thread.sleep(111);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("查看订单详情");
        // long end=System.currentTimeMillis();
        // System.out.println("耗时："+(end-start));
    }
}
