package com.powernode.proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**专门负责计时的一个调用处理器
 * 在这个调用处理器编写计时相关的计时代码
 * @Author iyeee
 * @Date 2023/2/5 1:58
 * @Version 1.0.1
 */
public class TimerInvocationHandler implements InvocationHandler {
    private Object target;
    public TimerInvocationHandler(Object target) {
        this.target=target;
    }
    // 1.jdk在底层调用invoke方法的程序已经写好了
    // 因此实现这样一个方法
    // 2.invoke方法什么时候被调用？
    // 当代理对象调用代理方法的时候，注册在InvocationHandler调用处理器中的invoke()方法被调用
    // 注意: 调用对象的代理方法的时候，如果需要做增强的话，目标对象的目标方法得保证执行
    // 3.invoke方法的三个参数
    // invoke方法是jdk负责调用的，所以调用这个方法的时候会自动给我们传过来这三个参数
    // 我们可以在invoke方法的大括号中直接使用
    // 第一个参数：Object proxy 代理对象的引用
    // 第二个参数：Method method 目标对象上的目标方法
    // 第三个参数：Object[] args 目标方法上的实参
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // System.out.println("增强1");
        // 调用目标对象上的目标方法
        // 方法四要素 哪里对象 哪个方法 传什么参数 返回什么值
        long begin=System.currentTimeMillis();
        Object retValue = method.invoke(target, args);
        long end=System.currentTimeMillis();
        System.out.println("耗时"+(end-begin));
        // System.out.println("增强2");
        return retValue;
    }
}
