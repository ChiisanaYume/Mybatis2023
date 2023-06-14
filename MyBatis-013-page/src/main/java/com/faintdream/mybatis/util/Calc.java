package com.faintdream.mybatis.util;

import java.math.BigDecimal;

/**
 * 一些计算的方法
 * @author faintdream
 * @version 1.0
 * @since 1.0
 */

public class Calc {

    private Calc(){}

    /**
     * 加法运算
     * @param a 加数(String类型)
     * @param b 加数(String类型)
     * @return 相加的和(String类型)
     * */
    public static String sum1(final String a,final String b){
        Double aa = new Double(a);
        Double bb = new Double(b);
        return String.valueOf(aa + bb);
    }
    public static String sum2(final String a,final String b){
        BigDecimal aa = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);
        return String.valueOf(aa.add(bb));
    }

    /**
     * 减法运算
     * @param a 被减数(String类型)
     * @param b =减数(String类型)
     * @return 相减的差(String类型)
     * */
    public static String sub1(final String a,final String b){
        Double aa = new Double(a);
        Double bb = new Double(b);
        return String.valueOf(aa - bb);
    }

    public static String sub2(final String a,final String b){
        BigDecimal aa = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);
        return String.valueOf(aa.subtract(bb));
    }

    /**
     * 乘法运算
     * @param a 乘数(String类型)
     * @param b =乘数(String类型)
     * @return 相乘的积(String类型)
     * */
    public static String mul1(final String a,final String b){
        BigDecimal aa = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);
        return String.valueOf(aa.multiply(bb));
    }

    /**
     * 除法运算
     * 默认的16位精度和4舍5入
     * @param a 被除数(String类型)
     * @param b =除数(String类型)
     * @return 商(String类型)
     * */
    public static String div1(final String a,final String b){
        BigDecimal aa = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);
        return String.valueOf(aa.divide(bb));
    }

    /**
     * 求余
     * @param a 被除数(String类型)
     * @param b =除数(String类型)
     * @return 余数(String类型)
     * */
    public static String rem1(final String a,final String b){
        BigDecimal aa = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);
        return String.valueOf(aa.remainder(bb));
    }

    /**
     * 整除
     * @param a 被除数(String类型)
     * @param b =除数(String类型)
     * @return 商(String类型)
     * */
    public static String div2(final String a,final String b){
        BigDecimal aa = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);
        return String.valueOf(aa.divideToIntegralValue(bb));
    }
}
