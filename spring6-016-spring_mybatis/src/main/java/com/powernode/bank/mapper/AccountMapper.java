package com.powernode.bank.mapper;

import com.powernode.bank.pojo.Account;

import java.util.List;

/**
 * @Author iyeee
 * @Date 2023/2/6 19:53
 * @Version 1.0.1
 */
// 该接口的实现类不需要写，是mybatis通过动态代理机制生成的实现类
public interface AccountMapper {
    /**
     * 新增账户
     * @param account
     * @return
     */
    /**
     * 插入
     * @param account
     * @return
     */
    int insert(Account account);

    /**
     * 删除
     * @param actno
     * @return
     */
    int deleteByActno(String actno);

    /**
     * 更新
     * @param account
     * @return
     */
    int update(Account account);

    /**
     * 查询一个
     * @param actno
     * @return
     */
    Account selectByActno(String actno);

    /**
     * 查询所有
     * @return
     */
    List<Account> selectAll();
}
