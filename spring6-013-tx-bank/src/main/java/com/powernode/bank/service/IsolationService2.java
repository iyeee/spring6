package com.powernode.bank.service;

import com.powernode.bank.dao.AccountDao;
import com.powernode.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author iyeee
 * @Date 2023/2/6 15:16
 * @Version 1.0.1
 */
@Service("22")
public class IsolationService2 {
    @Resource(name = "accountDao")
    private AccountDao accountDao;
    // 负责插入
    // 超时时间为10s，最后一条DML语句后的内容不计
    // readOnly=true 不能执行增删改 只能select 可以启动spring的优化策略，提高select语句的执行效率
    // @Transactional(readOnly = true,timeout = 10)
    // 主要发生RuntimeException或者这个异常的子类异常，都回滚
    // @Transactional(rollbackFor = RuntimeException.class)
    // 不会滚的异常
    @Transactional(noRollbackFor = NullPointerException.class)
    public void save(Account act){
        // try {
        //     Thread.sleep(1000*20);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        accountDao.insert(act);
        // throw new RuntimeException();
        throw new NullPointerException();
    }
}
