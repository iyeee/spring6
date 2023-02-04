package com.powernode.proxy.service;

/**
 * @Author iyeee
 * @Date 2023/2/5 2:52
 * @Version 1.0.1
 */
public class UserService {
    public boolean login(String username,String password){
        System.out.println("系统正在验证身份");
        return "admin".equals(username) && "123".equals(password);
    }
    public void logout(){
        System.out.println("系统正在退出..");
    }
}
