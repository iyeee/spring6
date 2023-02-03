package com.powernode.spring6.bean2;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Author iyeee
 * @Date 2023/2/3 15:36
 * @Version 1.0.1
 */
@Component
public class A {
    public A() {
        System.out.println("A()");
    }
}
@Controller
class B{
    public B(){
        System.out.println("B()");
    }

}
@Service
class C{
    public C(){
        System.out.println("C()");
    }
}
@Repository
class D{
    public D(){
        System.out.println("D()");
    }
}