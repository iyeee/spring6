package com.powernode.spring6.bean;

import java.util.Arrays;

/**
 * @Author iyeee
 * @Date 2022/12/8 21:03
 * @Version 1.0.1
 */
public class ArrayTest {
    private String[] hobbies;
    private Gir[] girs;

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public void setGirs(Gir[] girs) {
        this.girs = girs;
    }

    @Override
    public String toString() {
        return "ArrayTest{" +
                "hobbies=" + Arrays.toString(hobbies) +
                ", girs=" + Arrays.toString(girs) +
                '}';
    }
}
