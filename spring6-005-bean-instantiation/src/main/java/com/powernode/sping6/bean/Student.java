package com.powernode.sping6.bean;

import java.util.Date;

/**
 * @Author iyeee
 * @Date 2022/12/14 22:47
 * @Version 1.0.1
 */
public class Student {
//    java.util.Date 在spring当中当做简单类型，但是注入日期字符串格式有要求
//    也可以当做非简单类型
    private Date birth;

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "birth=" + birth +
                '}';
    }
}
