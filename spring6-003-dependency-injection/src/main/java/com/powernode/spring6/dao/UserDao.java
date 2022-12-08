package com.powernode.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author iyeee
 * @Date 2022/12/8 15:41
 * @Version 1.0.1
 */
public class UserDao {
    public static final Logger logger= LoggerFactory.getLogger("UserDao.class");
    public void insert(){
        logger.info("insert");
    }
}
