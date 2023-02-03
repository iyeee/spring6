package org.powernode.service;

import org.powernode.dao.OrderDao;
import org.springframework.stereotype.Service;

/**
 * @Author iyeee
 * @Date 2023/2/3 22:44
 * @Version 1.0.1
 */
@Service
public class OrderService {
    // 使用的时候不需要指定任何属性，直接使用这个注解即可,可以在属性上，构造方法上，set方法，如果构造方法只有一个且和属性对应上甚至可以省略
    // 这个注解的作用是根据类型byType进行自动装配
    // 一个接口如有多个实现类 @Autowired和@Qualifier联合使用
    // @Autowired
    // @Qualifier("orderDaoImplForOracle")
    public OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void generate(){
        orderDao.insert();
    }
}
