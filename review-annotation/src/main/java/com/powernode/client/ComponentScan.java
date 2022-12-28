package com.powernode.client;

import com.powernode.annotation.Component;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author iyeee
 * @Date 2022/12/27 22:51
 * @Version 1.0.1
 */
public class ComponentScan {
    public static void main(String[] args) {
        Map<String,Object> beanMap=new HashMap<>();
        //目前只知道一个包的名字，扫描这个包下所有的类，当这个类上有@Component，实例化该对象，然后放到map集合中
        String packageName="com.powernode.bean";
        // .这个正则表达式代表任意字符，这里的"."必须是一个普通字符，不能是正则表达式中的”.“
        // 使用\\.表示一个普通字符
        String packagePath = packageName.replaceAll("\\.", "/");
        // com是类的根路径下的一个目录
        URL resource = ClassLoader.getSystemClassLoader().getResource(packagePath);
        String path = resource.getPath();
        System.out.println(path);
        File file = new File(path);
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(f->{
            try{
                // System.out.println(f.getName());
                String className=packageName+"."+f.getName().split("\\.")[0];
                System.out.println(className);
                Class<?> aClass = Class.forName(className);
                if (aClass.isAnnotationPresent(Component.class)) {
                    Component annotation = aClass.getAnnotation(Component.class);
                    String id = annotation.value();
                    Object o = aClass.newInstance();
                    beanMap.put(id,o);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        });
        System.out.println(beanMap);
    }
}
