package com.powernode.bean;

import com.powernode.annotation.Component;

/**
 * @Author iyeee
 * @Date 2022/12/27 22:26
 * @Version 1.0.1
 */
@Component("userBean")
public class User {
    @Component("tom")
    private String name;
}
