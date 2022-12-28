package com.powernode.myspring.bean;

/**
 * @Author iyeee
 * @Date 2022/12/27 14:31
 * @Version 1.0.1
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
        userDao.insert();
    }
}
