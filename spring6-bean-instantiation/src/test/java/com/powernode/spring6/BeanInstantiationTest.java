package com.powernode.spring6;

import com.powernode.sping6.bean.Gun;
import com.powernode.sping6.bean.SpringBean;
import com.powernode.sping6.bean.Star;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author iyeee
 * @Date 2022/12/14 0:07
 * @Version 1.0.1
 */
public class BeanInstantiationTest {
    @Test
    public void testInstantiation1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        SpringBean sb = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb);
    }

    @Test
    public void testInstantiation2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Star star = applicationContext.getBean("starBean", Star.class);
        System.out.println(star);
    }

    @Test
    public void testInstantiation3(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Gun gun = applicationContext.getBean("gun", Gun.class);
        System.out.println(gun);
    }
}
