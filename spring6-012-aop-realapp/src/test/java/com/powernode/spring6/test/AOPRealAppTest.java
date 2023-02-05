package com.powernode.spring6.test;

import com.powernode.spring6.biz.UserService;
import com.powernode.spring6.biz.VipService;
import com.powernode.spring6.service.AccountService;
import com.powernode.spring6.service.OrderService;
import com.powernode.spring6.service.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author iyeee
 * @Date 2023/2/5 23:00
 * @Version 1.0.1
 */
public class AOPRealAppTest {
    @Test
    public void testSecurityLog(){
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = annotationConfigApplicationContext.getBean("userService", UserService.class);
        VipService vipService = annotationConfigApplicationContext.getBean("vipService", VipService.class);
        userService.saveUser();
        userService.deleteUser();
        userService.modifyUser();
        userService.getUser();

        vipService.getVip();
        vipService.modifyVip();

    }

    @Test
    public void testTransaction(){
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = annotationConfigApplicationContext.getBean("accountService", AccountService.class);
        OrderService orderService = annotationConfigApplicationContext.getBean("orderService", OrderService.class);
        accountService.transfer();
        accountService.withdraw();
        orderService.generate();
        orderService.cancel();
    }
}
