package com.faintdream.mybatis.pojo;

/**
 * POJO link t_genshin_region
 * @author faintdream
 * @version 1.0
 * */
public class Genshin_region {
    private String no;
    private String region;
    private String region_c;

    public Genshin_region(String no, String region, String region_c) {
        this.no = no;
        this.region = region;
        this.region_c = region_c;
    }

    public Genshin_region() {
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion_c() {
        return region_c;
    }

    public void setRegion_c(String region_c) {
        this.region_c = region_c;
    }

    @Override
    public String toString() {
        return "Genshin_region{" +
                "no='" + no + '\'' +
                ", region='" + region + '\'' +
                ", region_c='" + region_c + '\'' +
                '}';
    }
}
