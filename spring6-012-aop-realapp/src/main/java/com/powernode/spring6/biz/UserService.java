package com.powernode.spring6.biz;

import org.springframework.stereotype.Service;

/**
 * @Author iyeee
 * @Date 2023/2/5 23:16
 * @Version 1.0.1
 */
@Service
public class UserService {
    public void saveUser(){
        System.out.println("新增用户");
    }
    public void deleteUser(){
        System.out.println("删除用户");
    }
    public void modifyUser(){
        System.out.println("修改用户信息");
    }
    public void getUser(){
        System.out.println("获取用户信息");
    }
}
