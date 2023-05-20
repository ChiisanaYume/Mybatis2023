package com.faintdream.mybatis.temp;

public class UpdateById_Genshin_role_ParameterType {
    private String name;
    private String name_c;
    private String id;

    public UpdateById_Genshin_role_ParameterType(String name, String name_c, String id) {
        this.name = name;
        this.name_c = name_c;
        this.id = id;
    }

    public UpdateById_Genshin_role_ParameterType() {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
