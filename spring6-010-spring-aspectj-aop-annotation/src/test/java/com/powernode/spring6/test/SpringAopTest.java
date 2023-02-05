package com.powernode.spring6.test;

import com.powernode.spring6.service.OrderService;
import com.powernode.spring6.service.SpringConfig;
import com.powernode.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author iyeee
 * @Date 2023/2/5 20:53
 * @Version 1.0.1
 */
public class SpringAopTest {
    @Test
    public void testBefore(){
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = annotationConfigApplicationContext.getBean("userService", UserService.class);
        // userService.login();
        // userService.logout();
        OrderService orderService = annotationConfigApplicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }
}
