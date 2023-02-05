package com.powernode.bank.dao;

import com.powernode.bank.pojo.Account;

/**专门负责账户信息的CRUD操作
 * DAO中只执行SQL语句，没有任何业务逻辑
 * 也就是不和业务挂钩
 * @Author iyeee
 * @Date 2023/2/6 1:16
 * @Version 1.0.1
 */
public interface AccountDao {
    /**
     * 根据账号查询账号信息
     * @param actno
     * @return
     */
    Account selectActno(String actno);

    /**
     * 更新账户信息
     * @param act
     * @return
     */
    int update(Account act);

    int insert(Account act);
}
