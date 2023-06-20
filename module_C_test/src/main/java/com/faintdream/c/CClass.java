package com.faintdream.c;

public class CClass {

    private  String name = "Nahida";
    private  int age = 500;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "CClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
