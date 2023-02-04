package com.powernode.proxy.service;

/**
 * @Author iyeee
 * @Date 2023/2/5 0:55
 * @Version 1.0.1
 */
public class OrderServiceImplSon extends OrderServiceImpl{
    @Override
    public void generate() {
        long begin=System.currentTimeMillis();
        super.generate();
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"毫秒");
    }

    @Override
    public void modify() {
        super.modify();
    }

    @Override
    public void detail() {
        super.detail();
    }
}
