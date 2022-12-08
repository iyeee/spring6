package com.powernode.spring6.web;

import com.powernode.spring6.service.UserService;

/**
 * 表示层
 * @Author iyeee
 * @Date 2022/12/7 16:33
 * @Version 1.0.1
 */
public class UserAction {
    /*
    * 删除用户信息的请求
    * */
//    面向具体编程
//    UserService userService=new UserServiceImpl();
//    面向抽象编程
    private UserService userService;

//    1.构造注入
    public UserAction(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }

//   2.set注入
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void deleteRequest(){
        userService.deleteUser();
    }
}
