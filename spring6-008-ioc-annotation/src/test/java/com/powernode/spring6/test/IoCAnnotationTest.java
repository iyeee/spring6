package com.powernode.spring6.test;

import cn.powernode.service.StudentService;
import com.powernode.spring6.SpringConfig;
import com.powernode.spring6.bean.Order;
import com.powernode.spring6.bean.Student;
import com.powernode.spring6.bean3.User;
import com.powernode.spring6.bean.Vip;
import com.powernode.spring6.bean3.MyDataSource;
import com.powernode.spring6.dao.OrderDao;
import org.junit.Test;
import org.powernode.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author iyeee
 * @Date 2022/12/28 17:05
 * @Version 1.0.1
 */
public class IoCAnnotationTest {
    @Test
    public void testBeanComponent(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);
        Vip vipBean = applicationContext.getBean("vip", Vip.class);
        System.out.println(vipBean);
        Order orderBean = applicationContext.getBean("orderBean", Order.class);
        System.out.println(orderBean);
        Student studentBean = applicationContext.getBean("studentBean", Student.class);
        System.out.println(studentBean);

        OrderDao orderDao = applicationContext.getBean("orderDao", OrderDao.class);
        System.out.println(orderDao);

    }
    @Test
    public void testChoose(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-choose.xml");
    }

    @Test
    public void testDIByAnnotation(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-di-annotation.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);

        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void testAutoWired(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowired.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }

    @Test
    public void testResource(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-resource.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.deleteStudent();
    }

    @Test
    public void testNoXml(){
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        annotationConfigApplicationContext.getBean("orderBean");

    }
}
