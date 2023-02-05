package com.powernode.spring6.biz;

import org.springframework.stereotype.Service;

/**
 * @Author iyeee
 * @Date 2023/2/5 23:17
 * @Version 1.0.1
 */
@Service
public class VipService {
    public void saveVip(){
        System.out.println("新增vip");
    }
    public void deleteVip(){
        System.out.println("删除vip");
    }
    public void modifyVip(){
        System.out.println("修改vip信息");
    }
    public void getVip(){
        System.out.println("获取vip信息");
    }
}
