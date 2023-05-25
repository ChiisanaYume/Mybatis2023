package com.faintdream.cmd.demo;

import java.util.Properties;
import java.util.Set;

public class EnvVariablesDemo3 {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        Set<Object> objects = properties.keySet();
        // System.exit(0);
        Runtime.getRuntime().exit(0);
        for(Object o :objects){
            System.out.print(o+ ": ");
            System.out.println(properties.get(o));
        }
    }
}
