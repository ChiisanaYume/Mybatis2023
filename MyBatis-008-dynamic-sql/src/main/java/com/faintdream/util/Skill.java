package com.faintdream.util;

/**
 * 学习java过程中一些常用代码的封装
 * @author faintdream
 * @version 1.0
 * */
public class Skill {

    private Skill(){}

    /**
     * 释放资源(为了少些两行异常的代码)
     * @param resource 说有实现java.lang.AutoCloseable的对象
     * */
    private static void close(AutoCloseable resource){
        if(resource!=null){
            try {
                resource.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
