package com.powernode.bank.test;

import com.powernode.bank.SpringConfig;
import com.powernode.bank.pojo.Account;
import com.powernode.bank.service.AccountService;
import com.powernode.bank.service.IsolationService1;
import com.powernode.bank.service.IsolationService2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author iyeee
 * @Date 2023/2/6 2:20
 * @Version 1.0.1
 */
public class SpringTxTest {

    @Test
    public void testIsolation1(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        IsolationService1 bean = applicationContext.getBean("11", IsolationService1.class);
        bean.getByActno("act-007");


    }
    @Test
    public void testIsolation2(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        IsolationService2 bean2 = applicationContext.getBean("22", IsolationService2.class);
        bean2.save(new Account("act-013",1000.0));


    }
    @Test
    public void testPropagation(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.save(new Account("act-003",1000.0));
    }

    @Test
    public void testSpringTx(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        try {
            accountService.transfer("act-001","act-002",10000);
            System.out.println("转账成功");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
