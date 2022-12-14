package com.powernode.sping6.bean;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author iyeee
 * @Date 2022/12/14 22:58
 * @Version 1.0.1
 */
public class DateFactoryBean implements FactoryBean<Date> {
//    DateFactoryBean这个工厂bean协助我们Spring来创建这个简单的bean：Date
    private String strDate;

    public DateFactoryBean(String date) {
        this.strDate = date;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(strDate);
        return parse;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
