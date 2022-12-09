package com.powernode.spring6.bean;

/**
 * @Author iyeee
 * @Date 2022/12/9 14:16
 * @Version 1.0.1
 */
public class MathBean {
    private String result;

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "MathBean{" +
                "result='" + result + '\'' +
                '}';
    }
}
