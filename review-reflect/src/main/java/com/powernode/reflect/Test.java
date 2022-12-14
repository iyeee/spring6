package com.powernode.reflect;

/**
 * @Author iyeee
 * @Date 2022/12/15 2:35
 * @Version 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        // 不使用反射机制
        SomeServices someServices=new SomeServices();
        someServices.doSome();
        /*
        * 分析：调用一个方法 四要素
        * 1.第一要素：调用哪个对象
        * 2.第二要素：调用哪个方法
        * 3.第三要素：传什么参数
        * 4.第四要素：方法执行结束后返回结果*/
        String s1 = someServices.doSome("ad");
        System.out.println(s1);
        String s2 = someServices.doSome("ad", 3);
        System.out.println(s2);
    }
}
