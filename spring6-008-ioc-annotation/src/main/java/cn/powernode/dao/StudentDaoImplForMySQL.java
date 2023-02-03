package cn.powernode.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author iyeee
 * @Date 2023/2/4 0:34
 * @Version 1.0.1
 */
@Repository
public class StudentDaoImplForMySQL implements StudentDao{
    @Override
    public void deleteById() {
        System.out.println("mysql正在删除");
    }

}
