package com.powernode.spring6.service;

import org.springframework.stereotype.Service;

/**
 * @Author iyeee
 * @Date 2023/2/5 22:48
 * @Version 1.0.1
 */
@Service
public class AccountService {
    // 转账的业务方法
    public void transfer(){
        System.out.println("转账");
    }
    public void withdraw(){
        System.out.println("取款");
    }
}
