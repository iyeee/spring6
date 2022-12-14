package com.powernode.spring6;

import com.powernode.sping6.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author iyeee
 * @Date 2022/12/14 22:53
 * @Version 1.0.1
 */
public class SpringDateTest {
    @Test
    public void testDate(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }
}
