package com.powernode.spring6.test;

import com.powernode.spring6.bean.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author iyeee
 * @Date 2022/12/9 21:25
 * @Version 1.0.1
 */
public class SpringBeanScope {
    @Test
    public void testBeanScope(){
//       1.spring默认情况下，bean是单例的，在spring上下文初始化的时候实例化，每一次调用都返回那个单例的对象
//       2.若设置成prototype，bean是多例的，spring上下文初始化的时候，并不会初始化这些prototype的bean
//        每一次调用getBean（）的时候，实例化该bean对象
//        prototype翻译为：原型
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean springBean = applicationContext.getBean("springBean", SpringBean.class);
        SpringBean springBean2 = applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(springBean);
        System.out.println(springBean2);

    }
    @Test
    public void testThread(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean springBean = applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(springBean);

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                SpringBean springBean3 = applicationContext.getBean("springBean", SpringBean.class);
//                SpringBean springBean4 = applicationContext.getBean("springBean", SpringBean.class);
//                System.out.println(springBean3);
//                System.out.println(springBean4);
//            }
//        }).start();
        new Thread(()->{
            SpringBean springBean3 = applicationContext.getBean("springBean", SpringBean.class);
                SpringBean springBean4 = applicationContext.getBean("springBean", SpringBean.class);
                System.out.println(springBean3);
                System.out.println(springBean4);
        }).start();
    }
}
