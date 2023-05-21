package com.faintdream.mybatis.pojo;

/**
 * POJO link t_weapons_type
 * @author faintdream
 * @version 1.0
 * */
public class Weapons_type {
    private String no;
    private String weapons;
    private String weapons_c;

    public Weapons_type(String no, String weapons, String weapons_c) {
        this.no = no;
        this.weapons = weapons;
        this.weapons_c = weapons_c;
    }

    public Weapons_type() {
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }

    public String getWeapons_c() {
        return weapons_c;
    }

    public void setWeapons_c(String weapons_c) {
        this.weapons_c = weapons_c;
    }

    @Override
    public String toString() {
        return "Weapons_type{" +
                "no='" + no + '\'' +
                ", weapons='" + weapons + '\'' +
                ", weapons_c='" + weapons_c + '\'' +
                '}';
    }
}
