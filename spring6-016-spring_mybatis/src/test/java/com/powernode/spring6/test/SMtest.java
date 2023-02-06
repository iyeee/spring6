package com.powernode.spring6.test;

import com.powernode.bank.service.impl.AccountService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @Author iyeee
 * @Date 2023/2/6 20:44
 * @Version 1.0.1
 */
@ContextConfiguration(locations = "classpath:spring.xml")
@ExtendWith(SpringExtension.class)
public class SMtest {
    @Autowired
    private AccountService accountService;
    @Test
    public void testSM(){
        try {
            accountService.tranfer("act-001","act-007",1000);
            System.out.println("转账成功");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
