package com.powernode.spring6.test;

import com.powernode.spring6.SpringConfig;
import com.powernode.spring6.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * @Author iyeee
 * @Date 2023/2/6 18:41
 * @Version 1.0.1
 */
// @RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
// @ContextConfiguration("classpath:spring.xml")  //用配置文件
public class SpringJunit4Test {
    // @Test
    // public void testUser(){
    //     ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
    //     User user = applicationContext.getBean("user", User.class);
    //     System.out.println(user.getName());
    // }
    @Autowired
    private User user;
    // @Test
    public void testUser(){
        System.out.println(user.getName());
    }
}
