package com.faintdream.mybatis.pojo;

/**
 * POJO link t_elemental_type
 * @author faintdream
 * @version 1.0
 * */
public class Elemental_type {
    private String tno;
    private String type;
    private String type_c;

    public Elemental_type(String tno, String type, String type_c) {
        this.tno = tno;
        this.type = type;
        this.type_c = type_c;
    }

    public Elemental_type() {
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
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
                "tno='" + tno + '\'' +
                ", type='" + type + '\'' +
                ", type_c='" + type_c + '\'' +
                '}';
    }
}
