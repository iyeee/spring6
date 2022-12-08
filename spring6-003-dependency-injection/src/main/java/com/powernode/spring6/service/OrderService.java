package com.powernode.spring6.service;

import com.powernode.spring6.dao.OrderDao;

/**
 * @Author iyeee
 * @Date 2022/12/8 16:58
 * @Version 1.0.1
 */
public class OrderService {
    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void generate(){
        orderDao.generate();
    }
}
