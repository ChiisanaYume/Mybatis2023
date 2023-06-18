package com.faintdream.client;

import com.faintdream.annotation.MyAnnotation;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnnotationScan {
    public static void main(String[] args) throws URISyntaxException {
        Map<String,Object> beanMap = new HashMap<>();

        // 只知道一个包的名字，扫描这个包下所有的类
        // 当这个类上有@MyAnnotation 注解时，实例话该对象，并放在Map集合中
        String packageName = "com.faintdream.bean";
        // 扫描程序

        // 获取包路径
        String packagePath = packageName.replaceAll("\\.","/");
        // System.out.println(packagePath);

        // com路径实在根路径下的目录
        URL url = ClassLoader.getSystemClassLoader().getResource(packagePath);
        File path = new File(url.getPath());

        // 获取绝对路径下的所有文件
        File[] files = path.listFiles();

        Arrays.stream(files).forEach(f->{

            // System.out.println(f.getName());
            // System.out.println(f.getName().split("\\.")[0]);

            // 全限类名 = 包名 + 类名
            String className = packageName + "." + f.getName().split("\\.")[0];

            // 通过反射机制解析注解
            try {
                Class<?> aClass = Class.forName(className);

                // 判断是否有这个注解
                if(aClass.isAnnotationPresent(MyAnnotation.class)){
                    // 获取注解
                    MyAnnotation annotation = aClass.getAnnotation(MyAnnotation.class);

                    String id = annotation.value();

                    // 有这个注解的都要创建对象
                    Object obj = aClass.newInstance();
                    beanMap.put(id,obj);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println(beanMap);
    }


}


