package com.powernode.bank.service;

import com.powernode.bank.pojo.Account;

/**业务接口
 * 事物就是在这个接口下控制的
 * @Author iyeee
 * @Date 2023/2/6 1:47
 * @Version 1.0.1
 */
public interface AccountService {
    /**
     * 转账业务方法
     * @param fromActno 转出
     * @param toActno 转入
     * @param money 金额
     */
    void transfer(String fromActno,String toActno,double money);

    /**
     * 保存信息
     * @param act
     */
    void save(Account act);
}
