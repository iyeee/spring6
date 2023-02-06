package com.powernode.bank;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Author iyeee
 * @Date 2023/2/6 2:09
 * @Version 1.0.1
 */
@Configuration
// 开启事物注解
@EnableTransactionManagement
@ComponentScan({"com.powernode.bank"})
public class SpringConfig {


    // Spring框架看见bean注解后,会调用这个被标注的方法，这个方法的返回值是一个Java对象，这个Java对象会自动纳入Ioc容器管理
    // 返回的对象就是Spring容器中的一个bean
    @Bean("druidDataSource")
    public DruidDataSource getdruidDataSource(){
        DruidDataSource druidDataSource=new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/spring6");
        return druidDataSource;
    }
    @Bean("jdbcTemplate")
    public JdbcTemplate createJdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
    @Bean("txManager")
    // spring在调用这个方法的时候，会自动给我们传过来一个DataSource对象
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager=new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
