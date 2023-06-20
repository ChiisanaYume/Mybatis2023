package com.faintdream.mybatis.pojo;

public class Genshin_role {
    private String id;
    private String name;
    private String name_c;

    public Genshin_role(String id, String name, String name_c) {
        this.id = id;
        this.name = name;
        this.name_c = name_c;
    }

    public Genshin_role() {
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

    public String getName_c() {
        return name_c;
    }

    public void setName_c(String name_c) {
        this.name_c = name_c;
    }

    @Override
    public String toString() {
        return "Genshin_role{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", name_c='" + name_c + '\'' +
                '}';
    }
}
