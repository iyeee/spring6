package com.powernode.bank.service;

import com.powernode.bank.dao.AccountDao;
import com.powernode.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author iyeee
 * @Date 2023/2/6 15:15
 * @Version 1.0.1
 */
@Service("11")
public class IsolationService1 {
    @Resource(name="accountDao")
    private AccountDao accountDao;
    // 负责查询

    // 当前事物可以读取到别人还没提交的数据
    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    public void getByActno(String actno){
        Account account = accountDao.selectActno(actno);
        System.out.println("查询到的账户信息"+account);
    }

}
