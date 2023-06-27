package com.faintdream.testb;

import java.lang.reflect.Method;

public class TestA1 {
    public static void main(String[] args) {
        try{
            Class<?> aClass = Class.forName("com.faintdream.a.AClass");
            System.out.println(aClass);

            Method m = aClass.getDeclaredMethods()[0];
            m.setAccessible(true);
            // m.invoke(aClass.newInstance(),null); //已过时的方法
            m.invoke(aClass.getDeclaredConstructor().newInstance(),null);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
