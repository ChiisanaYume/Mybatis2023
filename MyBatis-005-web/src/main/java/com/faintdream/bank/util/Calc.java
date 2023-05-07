package com.faintdream.bank.util;

/**
 * 一些计算的方法
 * @author faintdream
 * @version 1.0
 * @since 1.0
 */

public class Calc {

    private Calc(){}

    public static String sum1(final String a,final String b){
        Double aa = new Double(a);
        Double bb = new Double(b);
        return String.valueOf(aa + bb);
    }

    public static String sub1(final String a,final String b){
        Double aa = new Double(a);
        Double bb = new Double(b);
        return String.valueOf(aa - bb);
    }
}
