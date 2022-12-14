package com.powernode.reflect;

/**
 * @Author iyeee
 * @Date 2022/12/15 2:32
 * @Version 1.0.1
 */
public class SomeServices {
    public void doSome(){
        System.out.println("public void doSome()执行");
    }
    public String doSome(String s){
        System.out.println("public String doSome(String s)执行");
        return s;
    }
    public String doSome(String s,int i){
        System.out.println("public String doSome(String s,int i)执行");
        return s+i;
    }
}
