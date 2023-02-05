package com.powernode.bank.service.impl;

import com.powernode.bank.dao.AccountDao;
import com.powernode.bank.pojo.Account;
import com.powernode.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author iyeee
 * @Date 2023/2/6 1:57
 * @Version 1.0.1
 */
@Service("accountService")
// @Transactional
public class AccountServiceImpl implements AccountService {
    @Resource(name = "accountDao")
    private AccountDao  accountDao;
    // 控制事物
    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public void transfer(String fromActno, String toActno, double money) {
        // 开启事物

        Account fromAct = accountDao.selectActno(fromActno);
        if (fromAct.getBalance()<money) {
            throw new RuntimeException("余额不足");
        }
        Account toAct = accountDao.selectActno(toActno);
        fromAct.setBalance(fromAct.getBalance()-money);
        toAct.setBalance(toAct.getBalance()+money);
        int count = accountDao.update(fromAct);

        // String s=null;
        // s.toString();

        count+= accountDao.update(toAct);
        if(count!=2){
            throw new RuntimeException("转账失败");
        }

        //没有异常，提交事务
        //有异常，回滚事务

    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void withDraw(){

    }

    @Resource(name = "accountService2")
    private AccountService accountService;
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Account act) {
        accountDao.insert(act);
        Account act2=new Account("act-004",1000.0);
        try{
            accountService.save(act2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
