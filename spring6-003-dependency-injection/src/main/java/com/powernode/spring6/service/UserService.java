package com.powernode.spring6.service;

import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.dao.VipDao;

/**
 * @Author iyeee
 * @Date 2022/12/8 15:43
 * @Version 1.0.1
 */
public class UserService {
    private UserDao userDao;
    private VipDao vipDao;
//  set注入，必须提供一个set方法
//    spring容器会调用这个set方法,前三个字母不能随便写，必须是“set”
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }

    public void saveUser(){
        userDao.insert();
        vipDao.insert();
    }
}
