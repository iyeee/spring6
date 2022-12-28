package com.powernode.myspring;

import com.powernode.myspring.bean.UserService;
import org.junit.Test;
import org.myspringframework.core.ApplicationContext;
import org.myspringframework.core.ClassPathXmlApplicationContext;

/**
 * @Author iyeee
 * @Date 2022/12/27 15:15
 * @Version 1.0.1
 */
public class test {
    @Test
    public void testMySpring(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
        Object user = applicationContext.getBean("user");
        UserService userService =(UserService) applicationContext.getBean("userService");
        userService.save();


    }
}
