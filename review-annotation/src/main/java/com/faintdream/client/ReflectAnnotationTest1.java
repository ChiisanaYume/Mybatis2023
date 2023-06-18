package com.faintdream.client;

import com.faintdream.annotation.MyAnnotation;
import com.faintdream.bean.User;

public class ReflectAnnotationTest1 {

    public static void main(String[] args) throws ClassNotFoundException {

        // 通过反射机制获取注解
        // 获取类
        Class<?> aClass = Class.forName("com.faintdream.bean.User");

        // 判断类上有没有这个注解
        if(aClass.isAnnotationPresent(MyAnnotation.class)){

            // 获取类上的注解
            MyAnnotation annotation = aClass.getAnnotation(MyAnnotation.class);

            // 访问注解属性
            System.out.println(annotation.value());
        }
    }
}
