package com.powernode.spring6.service;

import org.springframework.stereotype.Service;

/**
 * @Author iyeee
 * @Date 2023/2/5 21:14
 * @Version 1.0.1
 */
@Service
public class OrderService {
    public void generate(){
        System.out.println("生成");
        // throw new RuntimeException("运行时异常");
    }
}
