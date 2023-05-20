package com.faintdream.mybatis.pojo;

/**
 * POJO link t_sex
 * @author faintdream
 * @version 1.0
 * */
public class Sex {
    private String sno;
    private String sex;
    private String sex_c;

    public Sex(){}

    public Sex(String sno, String sex, String sex_c) {
        this.sno = sno;
        this.sex = sex;
        this.sex_c = sex_c;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex_c() {
        return sex_c;
    }

    public void setSex_c(String sex_c) {
        this.sex_c = sex_c;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "sex_c='" + sex_c + '\'' +
                '}';
    }
}
