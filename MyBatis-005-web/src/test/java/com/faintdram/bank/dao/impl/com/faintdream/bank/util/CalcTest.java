package com.faintdram.bank.dao.impl.com.faintdream.bank.util;

import com.faintdream.bank.util.Calc;
import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

    @Test
    public void sum1Test(){
        String s1 = "200";
        String s2 = "33";
        String s3 = "2000";
        String s4 = "23";
        Assert.assertEquals("233.0",Calc.sum1(s1,s2));
        Assert.assertEquals("2023.0",Calc.sum1(s3,s4));
    }

    @Test
    public void sum2Test(){
        String s1 = "200";
        String s2 = "33";
        String s3 = "2000";
        String s4 = "23";
        Assert.assertEquals("233.0",Calc.sum1(s1,s2));
        Assert.assertEquals("2023.0",Calc.sum1(s3,s4));
    }
    @Test
    public void sub1Test(){
        String s1 = "888";
        String s2 = "222";
        String s3 = "2048";
        String s4 = "49";
        Assert.assertEquals("666.0",Calc.sub1(s1,s2));
        Assert.assertEquals("1999.0",Calc.sub1(s3,s4));
    }

    @Test
    public void sub2Test(){
        String s1 = "888";
        String s2 = "222";
        String s3 = "2048";
        String s4 = "49";
        Assert.assertEquals("666.0",Calc.sub1(s1,s2));
        Assert.assertEquals("1999.0",Calc.sub1(s3,s4));
    }

    @Test
    public void mul1Test(){
        String s1 = "888";
        String s2 = "222";
        String s3 = "2048";
        String s4 = "49";
        String s5 = "100.0";
        String s6 = "100.0";
        Assert.assertEquals("197136",Calc.mul1(s1,s2));
        Assert.assertEquals("100352",Calc.mul1(s3,s4));
        Assert.assertEquals("10000.00",Calc.mul1(s5,s6));
    }
}
