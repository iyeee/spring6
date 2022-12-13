package com.powernode.simple.factory;

/**
 * @Author iyeee
 * @Date 2022/12/13 23:03
 * @Version 1.0.1
 */
public class Test {
    public static void main(String[] args) {
//        客户端不需要关心产品的生产细节，只负责消费，工厂类负责生产，达到了职责分离
        Weapen q = WeapenFactory.get("TANK");
        q.attack();
        Weapen fighter = WeapenFactory.get("FIGHTER");
        fighter.attack();
    }
}
