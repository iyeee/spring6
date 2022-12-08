package com.powernode.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author iyeee
 * @Date 2022/12/8 16:57
 * @Version 1.0.1
 */
public class OrderDao {
    private static final Logger logger= LoggerFactory.getLogger(OrderDao.class);

    public void generate(){
        logger.info("订单正在生成");
    }
}
