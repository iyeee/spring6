package com.powernode.spring6.test;

import com.powernode.spring6.bean.*;
import com.powernode.spring6.jdbc.MyDataSource;
import com.powernode.spring6.service.CustomerService;
import com.powernode.spring6.service.OrderService;
import com.powernode.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author iyeee
 * @Date 2022/12/8 15:55
 * @Version 1.0.1
 */
public class SpringDITest {
    @Test
    public void testSetDITest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userServiceBean", UserService.class);
        userService.saveUser();

    }
    @Test
    public void testConstructorDI( ){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        CustomerService csBean = applicationContext.getBean("csBean", CustomerService.class);
        CustomerService csBean2 = applicationContext.getBean("csBean2", CustomerService.class);
        CustomerService csBean3 = applicationContext.getBean("csBean3", CustomerService.class);
        csBean.save();
        csBean2.save();
        csBean3.save();

    }

    @Test
    public void testSetDI2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("set-di.xml");
        OrderService orderServiceBean = applicationContext.getBean("orderServiceBean", OrderService.class);
        orderServiceBean.generate();


        OrderService orderServiceBean1 = applicationContext.getBean("orderServiceBean2", OrderService.class);
        orderServiceBean1.generate();
    }
    @Test
    public void testSimpleTypeSet(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("set-di.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);

        SimpleValueType svt = applicationContext.getBean("svt", SimpleValueType.class);
        System.out.println(svt);
    }
    @Test
    public void testMyDataSource(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("set-di.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
    }
    @Test
    public void testCascade(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("cascade.xml");
        Student studentBean = applicationContext.getBean("studentBean2", Student.class);
        System.out.println(studentBean);
        Clazz clazzBean = applicationContext.getBean("clazzBean", Clazz.class);
        System.out.println(clazzBean);
    }

    @Test
    public void testArray(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-array.xml");
        ArrayTest arrayTest = applicationContext.getBean("arrayTest", ArrayTest.class);
        System.out.println(arrayTest);
    }
}
