package com.powernode.spring6.bean;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author iyeee
 * @Date 2022/12/7 22:02
 * @Version 1.0.1
 */
public class UserTest {
    @Test
    public void testFirstSpringCode(){
//        1、获取spring容器对象
//        应用上下文，其实是Spring容器
//        ClassPathXmlApplicationContext 从类路径中加载Spring配置文件的一个spring上下文对象
//        代码只要执行，就相当于启动Spring容器，解析spring.xml文件，并且实例化所有的bean对象，放到spring容器中
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml","xml/beans.xml");
//        2、根据bean的id从spring容器中获取这个对象
        Object userBean = applicationContext.getBean("userBean");
        System.out.println(userBean);

        Object userBean2 = applicationContext.getBean("userBean");
        System.out.println(userBean2);

//      也可以是JDK中的类，比如java.util.Date
        Date nowTime = (Date)applicationContext.getBean("nowTime");
        System.out.println(nowTime);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(simpleDateFormat.format(nowTime));

        Date nowTime1 = applicationContext.getBean("nowTime", Date.class);
        System.out.println(simpleDateFormat.format(nowTime1));

//        bean的id不存在，出现异常
//        Object nowTime2 = applicationContext.getBean("nowTime2");
//        System.out.println(nowTime2);

    }
    @Test
    public void testXmlPath(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\Projects\\IdeaProjects\\java\\spring6\\spring6-002-first\\src\\main\\resources\\xml\\beans.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);
    }
    @Test
    public void testBeanFactory(){
//        ApplicationContext接口的超级父接口是 BeanFactory（翻译为Bean工厂，就是能够生产bean对象的一个工厂对象）
//        BeanFactory是Ioc容器的顶级接口
//        Ioc容器实际上使用了工厂模式
//        Spring底层的Ioc是怎么实现的   xml解析+工厂模式+反射机制
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        BeanFactory applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        User user=applicationContext.getBean("userBean",User.class);
        System.out.println(user);


    }
    @Test
    public void testBeginInitBean(){
//        注意，不是在调用getBean(）方法的时候创建对象，执行以下代码的时候，就会实例化对象
        BeanFactory applicationContext=new ClassPathXmlApplicationContext("spring.xml");

        Logger logger= LoggerFactory.getLogger("UserTest.class");
        logger.info("dasdasdda");

    }

}