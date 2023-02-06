package com.powernode.spring6.test;

import com.powernode.spring6.SpringConfig;
import com.powernode.spring6.bean.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @Author iyeee
 * @Date 2023/2/6 18:50
 * @Version 1.0.1
 */
@ContextConfiguration(classes = SpringConfig.class)
@ExtendWith(SpringExtension.class)
public class SpringJunit5Test {
    @Autowired
    private User user;
    @Test
    public void testUser(){
        System.out.println(user.getName());
    }
}
