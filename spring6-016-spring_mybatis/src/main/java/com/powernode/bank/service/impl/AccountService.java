package com.powernode.bank.service.impl;

import com.powernode.bank.pojo.Account;

import java.util.List;

/**
 * @Author iyeee
 * @Date 2023/2/6 20:10
 * @Version 1.0.1
 */

public interface AccountService {
    /**
     * 开户
     * @param act
     * @return
     */
    int save(Account act);

    /**
     * 销户
     * @param actno
     * @return
     */
    int deleteByActno(String actno);

    /**
     * 修改账户
     * @param account
     * @return
     */
    int modify(Account account);

    /**
     * 查询账户
     * @param actno
     * @return
     */
    Account getByActno(String actno);

    /**
     * 查询所有
     * @return
     */
    List<Account> getAll();

    /**
     * 转账
     * @param fromActno
     * @param toActno
     * @param money
     */
    void tranfer(String fromActno,String toActno,double money);
}
