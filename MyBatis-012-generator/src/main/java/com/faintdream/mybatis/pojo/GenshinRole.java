package com.faintdream.mybatis.pojo;

public class GenshinRole {
    private Integer id;

    private String name;

    private String nameC;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNameC() {
        return nameC;
    }

    public void setNameC(String nameC) {
        this.nameC = nameC == null ? null : nameC.trim();
    }

    @Override
    public String toString() {
        return "GenshinRole{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nameC='" + nameC + '\'' +
                '}';
    }
}