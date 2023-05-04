package com.faintdream.junit.service;

import org.junit.Assert;
import org.junit.Test;

/**
 * 单元测试类
 * @author faintdream
 * @version 1.0
 * @since 1.0
 * */

public class MathServiceTest {
    // 命名规范:需要测试的类加上 + Test
    // 一般一个业务类对应一个测试方法
    // 测试方法的规范 public void testXxx(){}
    // @Test注解:被这个注解标注的方法就是一个单元测试方法

    @Test
    public void testSum(){

        // 单元测试有两个很重要的概念:
        // 实际值(被测试的业务真正的执行结果)
        // 期望值(执行这个业务方法之后，你期望的执行结果)
        MathService mathService = new MathService();

        //实际值
        int actual = mathService.sum(220,13);

        //期望值
        int expected = 233;

        //加断言方法进行测试
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSub(){
        MathService mathService = new MathService();
        int actual = mathService.sub(688,22);
        int expected = 666;
        Assert.assertEquals(actual,expected);
    }
}
