package com.powernode.spring6.service.impl;

import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.dao.impl.UserDaoImplForMySQL;
import com.powernode.spring6.service.UserService;

/**
 * @Author iyeee
 * @Date 2022/12/7 16:36
 * @Version 1.0.1
 */
public class UserServiceImpl implements UserService {
    UserDao userDao=new UserDaoImplForMySQL();
    @Override
    public void deleteUser() {
        userDao.deleteById();
    }
    public void saveUser(){

    }
}
