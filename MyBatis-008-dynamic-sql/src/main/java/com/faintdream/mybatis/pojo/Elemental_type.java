package com.faintdream.mybatis.pojo;

/**
 * POJO link t_elemental_type
 * @author faintdream
 * @version 1.0
 * */
public class Elemental_type {
    private String no;
    private String type;
    private String type_c;

    public Elemental_type(String no, String type, String type_c) {
        this.no = no;
        this.type = type;
        this.type_c = type_c;
    }

    public Elemental_type() {
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType_c() {
        return type_c;
    }

    public void setType_c(String type_c) {
        this.type_c = type_c;
    }

    @Override
    public String toString() {
        return "Elemental_type{" +
                "no='" + no + '\'' +
                ", type='" + type + '\'' +
                ", type_c='" + type_c + '\'' +
                '}';
    }
}
