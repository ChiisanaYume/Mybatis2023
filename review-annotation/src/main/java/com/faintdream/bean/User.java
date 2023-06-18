package com.faintdream.bean;

import com.faintdream.annotation.MyAnnotation;

@MyAnnotation("Amber")
public class User {
    String name = "Amber";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
