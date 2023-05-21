package com.faintdream.mybatis.pojo;

/**
 * POJO link t_sex
 * @author faintdream
 * @version 1.0
 * */
public class Sex {
    private String no;
    private String sex;
    private String sex_c;

    public Sex(String no, String sex, String sex_c) {
        this.no = no;
        this.sex = sex;
        this.sex_c = sex_c;
    }

    public Sex() {
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
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
}
