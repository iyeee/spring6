package com.powernode.spring6.test;

import com.powernode.spring6.bean.SpringConfig;
import com.powernode.spring6.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author iyeee
 * @Date 2023/2/4 2:17
 * @Version 1.0.1
 */
public class SpringJdbcTest {
    @Test
    public void testJdbc(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println(jdbcTemplate);
        String sql="insert into t_user(real_name,age) values(?,?)";
        // jdbcTemplate insert delete update都是 update
        int count = jdbcTemplate.update(sql, "王五", 20);
        System.out.println(count);
    }
    @Test
    public void testJdbcAnnotation(){
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate jdbcTemplate = annotationConfigApplicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println(jdbcTemplate);

    }

    @Test
    public void testInsert(){
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate jdbcTemplate = annotationConfigApplicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql="insert into t_user(real_name,age) values(?,?)";
        // jdbcTemplate insert delete update都是 update
        int count = jdbcTemplate.update(sql, "王五", 20);
        System.out.println(count);
    }

    @Test
    public void testUpdate(){
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate jdbcTemplate = annotationConfigApplicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql="update t_user set real_name =?,age=? where id =?";
        int count= jdbcTemplate.update(sql,"tom",55,1);
        System.out.println(count);

    }

    @Test
    public void testDelete(){
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate jdbcTemplate = annotationConfigApplicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql="delete from t_user where id=?";
        int count= jdbcTemplate.update(sql,2);
        System.out.println(count);
    }

    @Test
    public void testQueryOne(){
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate jdbcTemplate = annotationConfigApplicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql="select id,real_name,age from t_user where  id=?";
        User user= jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),1);
        System.out.println(user);
    }

    @Test
    public void testQueryAll(){
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate jdbcTemplate = annotationConfigApplicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql="select id,real_name,age from t_user";
        List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        System.out.println(query);
    }

    @Test
    public void testQueryOneValue(){
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate jdbcTemplate = annotationConfigApplicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql="select count(0) from t_user";
        Integer integer = jdbcTemplate.queryForObject(sql, int.class);
        System.out.println(integer);

    }

    @Test
    public void testBatchInsert(){
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate jdbcTemplate = annotationConfigApplicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql="insert into t_user(real_name,age) values(?,?)";
        Object[] objects={"asd",30};
        Object[] objects1={"asd1",31};
        Object[] objects2={"asd2",33};
        Object[] objects3={"asd3",34};
        List<Object[]> list=new ArrayList<>();
        list.add(objects);
        list.add(objects1);
        list.add(objects2);
        list.add(objects3);
        int[] ints = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(ints));

    }
    @Test
    public void testBatchUpdate(){
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate jdbcTemplate = annotationConfigApplicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql="update t_user set real_name=?,age=? where id =?";
        Object[] objects1={"dasd",22,11};
        Object[] objects2={"dasd1",22,12};
        Object[] objects3={"dasd2",22,13};
        Object[] objects4={"dasd3",22,14};
        List<Object[]> list=new ArrayList<>();
        list.add(objects1);
        list.add(objects2);
        list.add(objects3);
        list.add(objects4);
        int[] ints = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void testBatchDelete(){
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate jdbcTemplate = annotationConfigApplicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql="delete from t_user where id =?";
        Object[] objects1={11};
        Object[] objects2={12};
        Object[] objects3={13};
        Object[] objects4={14};
        List<Object[]> list=new ArrayList<>();
        list.add(objects1);
        list.add(objects2);
        list.add(objects3);
        list.add(objects4);
        int[] ints = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(ints));
    }
    @Test
    public void testCallBack(){
        //如果想写JDBC代码，可用callback回调函数
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate jdbcTemplate = annotationConfigApplicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql="select id,real_name,age from t_user where id=?";
        User execute = jdbcTemplate.execute(sql, new PreparedStatementCallback<User>() {
            // 执行回调函数，当exec方法执行的时候，回调函数中的doInPreparedStatement会被调动
            @Override
            public User doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setInt(1, 4);
                ResultSet resultSet = ps.executeQuery();
                User user = null;
                if (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String realName = resultSet.getString("real_name");
                    int age = resultSet.getInt("age");
                    user = new User(id, realName, age);
                }
                return user;
            }
        });
        System.out.println(execute);
    }
}