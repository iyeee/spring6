package org.powernode.dao.impl;

import org.powernode.dao.OrderDao;
import org.springframework.stereotype.Repository;

/**
 * @Author iyeee
 * @Date 2023/2/3 22:42
 * @Version 1.0.1
 */
@Repository
public class OrderDaoImplForMySQL implements OrderDao {
    @Override
    public void insert() {
        System.out.println("mysql正在保存");
    }
}
