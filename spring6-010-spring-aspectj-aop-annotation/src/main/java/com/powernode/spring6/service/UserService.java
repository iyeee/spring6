package com.powernode.spring6.service;

import org.springframework.stereotype.Service;

/**
 * @Author iyeee
 * @Date 2023/2/5 20:35
 * @Version 1.0.1
 */
@Service
public class UserService {
    public void login(){
        System.out.println("登录");
    }
    public void logout(){
        System.out.println("登出");
    }


}
