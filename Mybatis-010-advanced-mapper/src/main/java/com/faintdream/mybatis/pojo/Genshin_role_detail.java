package com.faintdream.mybatis.pojo;

/**
 * POJO link t_genshin_region_detail
 * @author faintdream
 * @version 1.0
 * */
public class Genshin_role_detail {
    private String id;
    private String sex;
    private String elemental_type;
    private String region;
    private String weapons_type;

    private String rarity;

    private Role_physique physique;
    public Genshin_role_detail(){}

    public Genshin_role_detail(String id, String sex, String elemental_type, String region, String weapons_type, String rarity) {
        this.id = id;
        this.sex = sex;
        this.elemental_type = elemental_type;
        this.region = region;
        this.weapons_type = weapons_type;
        this.rarity = rarity;
    }

    public Genshin_role_detail(String id, String sex, String elemental_type, String region, String weapons_type) {
        this.id = id;
        this.sex = sex;
        this.elemental_type = elemental_type;
        this.region = region;
        this.weapons_type = weapons_type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getElemental_type() {
        return elemental_type;
    }

    public void setElemental_type(String elemental_type) {
        this.elemental_type = elemental_type;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getWeapons_type() {
        return weapons_type;
    }

    public void setWeapons_type(String weapons_type) {
        this.weapons_type = weapons_type;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public Role_physique getPhysique() {
        return physique;
    }

    public void setPhysique(Role_physique physique) {
        this.physique = physique;
    }


    @Override
    public String toString() {
        return "Genshin_role_detail{" +
                "id='" + id + '\'' +
                ", sex='" + sex + '\'' +
                ", elemental_type='" + elemental_type + '\'' +
                ", region='" + region + '\'' +
                ", weapons_type='" + weapons_type + '\'' +
                ", rarity='" + rarity + '\'' +
                ", physique=" + physique +
                '}';
    }
}
