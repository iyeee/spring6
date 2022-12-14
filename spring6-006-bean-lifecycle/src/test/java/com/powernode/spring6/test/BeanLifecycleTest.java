package com.powernode.spring6.test;

import com.powernode.spring6.bean.Student;
import com.powernode.spring6.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author iyeee
 * @Date 2022/12/14 23:35
 * @Version 1.0.1
 */
public class BeanLifecycleTest {
    /*
    * Spring容器只对singleton的bean进行完整的生命周期管理
    * 如果是prototype作用域的bean，spring容器只负责将bean初始化完毕，等客户端程序一旦获取到该bean之后，spring就不再管理该对象的生命周期
    * */
    @Test
    public void testBean(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println("第四步：使用bean");
//        注意手动关闭视频spring容器，这样spring容器才会销毁bean
        ClassPathXmlApplicationContext context= (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }

    @Test
    public void testRegisterBean(){
//      自己new的bean
        Student student=new Student();
        System.out.println(student);
//        将以上自己new的bean对象纳入spring容器来管理，半路上交给spring来管理
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        defaultListableBeanFactory.registerSingleton("studentBean",student);
//       从spring容器中获取bean
        Object studentBean = defaultListableBeanFactory.getBean("studentBean");
//       内存地址相同
        System.out.println(studentBean);
    }
}
