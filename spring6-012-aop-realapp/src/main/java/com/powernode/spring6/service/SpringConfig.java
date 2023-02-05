package com.powernode.spring6.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author iyeee
 * @Date 2023/2/5 22:57
 * @Version 1.0.1
 */
@Configuration
@ComponentScan({"com.powernode.spring6.service","com.powernode.spring6.biz"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
