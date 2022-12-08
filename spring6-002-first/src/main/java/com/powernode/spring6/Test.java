package com.powernode.spring6;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author iyeee
 * @Date 2022/12/8 1:36
 * @Version 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        Logger logger=LoggerFactory.getLogger(Test.class);

        logger.info("info");
        logger.debug("debug");
        logger.error("error");
    }
}
