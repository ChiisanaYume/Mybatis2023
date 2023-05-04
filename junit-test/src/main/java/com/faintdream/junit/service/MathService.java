package com.faintdream.junit.service;

/**
 * 数学业务类
 * @author faintdream
 * @version 1.0
 * @since 1.0
 * */
public class MathService {

    /**
     * 相加的业务方法
     * @param a
     * @param b
     * @return int
     * */
    public int sum(int a, int b) {
        return a + b;
    }

    /**
     * 相减的业务方法
     * @param a
     * @param b
     * @return int
     * */
    public int sub(int a, int b) {
        return a - b;
    }
}
