package com.faintdream.mybatis.pojo;

public class GenshinRole {
    private String id;
    private String name;
    private String sex;
    private String elementalType;
    private String region;
    private String WeaponsType;
    private String rarity;
    private String physique;

    public GenshinRole() {
    }

    public GenshinRole(String id, String name, String sex, String elementalType, String region, String weaponsType, String rarity, String physique) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.elementalType = elementalType;
        this.region = region;
        WeaponsType = weaponsType;
        this.rarity = rarity;
        this.physique = physique;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getElementalType() {
        return elementalType;
    }

    public void setElementalType(String elementalType) {
        this.elementalType = elementalType;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getWeaponsType() {
        return WeaponsType;
    }

    public void setWeaponsType(String weaponsType) {
        WeaponsType = weaponsType;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getPhysique() {
        return physique;
    }

    public void setPhysique(String physique) {
        this.physique = physique;
    }

    @Override
    public String toString() {
        return "GenshinRole{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", elementalType='" + elementalType + '\'' +
                ", region='" + region + '\'' +
                ", WeaponsType='" + WeaponsType + '\'' +
                ", rarity='" + rarity + '\'' +
                ", physique='" + physique + '\'' +
                '}';
    }
}
