package com.faintdream.client;

import com.faintdream.annotation.MyAnnotation;
import com.faintdream.bean.Order;

public class ReflectAnnotationScan {

    public static void main(String... args) throws ClassNotFoundException {
        ReflectAnnotationScan scan = new ReflectAnnotationScan();
        scan.reflect("com.faintdream.bean.Vip");
        scan.reflect(new Order());
    }

    /**
     * 反射一个类，测试这个类是否有MyAnnotation这个注解,
     * @param c 类
     * @return 有这个注解，会返回true,并打印注解的value属性，没有的话，返回false
     *  */
    public boolean reflect(Class<?> c){
        if(c.isAnnotationPresent(MyAnnotation.class)){

            // 获取类上的注解
            MyAnnotation annotation = c.getAnnotation(MyAnnotation.class);

            // 访问注解属性
            System.out.println(annotation.value());

            return true;
        }
        return false;
    }

    /**
     * 测试一个实例的对象它的类是否有MyAnnotation这个注解,
     * @param o 类(实例)
     * @return 有这个注解，会返回true,并打印注解的value属性，没有的话，返回false
     *  */
    public boolean reflect(Object o) {
        return reflect(o.getClass());
    }

    /**
     * 反射一个类，测试这个类是否有MyAnnotation这个注解,
     * @param className 类(权限类名)
     * @return 有这个注解，会返回true,并打印注解的value属性，没有的话，返回false
     * @throws ClassNotFoundException
     *  */
    public boolean reflect(String className) throws ClassNotFoundException {
        Class<?> c = Class.forName(className);
        return reflect(c);
    }
}
