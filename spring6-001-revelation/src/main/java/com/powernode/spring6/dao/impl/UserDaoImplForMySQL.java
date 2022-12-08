package com.powernode.spring6.dao.impl;

import com.powernode.spring6.dao.UserDao;

/**
 * @Author iyeee
 * @Date 2022/12/7 16:35
 * @Version 1.0.1
 */
public class UserDaoImplForMySQL implements UserDao {
    @Override
    public void deleteById() {
        System.out.println("MySQL数据库正在删除");
    }
}
