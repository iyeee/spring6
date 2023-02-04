package com.powernode.spring6.bean;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @Author iyeee
 * @Date 2023/2/4 2:30
 * @Version 1.0.1
 */
@Configuration
@ComponentScan("com.powernode.spring6.bean")
public class SpringConfig {

    @Bean("druidDataSource")
    public DataSource getDruidDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/spring6");
        System.out.println("druid");
        return druidDataSource;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate createJdbcTemplate(@Qualifier("druidDataSource") DataSource DataSource){
        return new JdbcTemplate(DataSource);
    }


}
