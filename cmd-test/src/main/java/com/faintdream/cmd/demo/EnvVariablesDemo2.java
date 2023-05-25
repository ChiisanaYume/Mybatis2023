package com.faintdream.cmd.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnvVariablesDemo2 {

    public static void main(String[] args) {

        try {
            //调用系统命令执行set命令(/c不回显)
            Process process = Runtime.getRuntime().exec("cmd /c set");

            //读取命令行输出结果
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                //System.out.println("+++++++提取Key+++++++");
                //String key = line.substring(0, line.indexOf("="));
                //System.out.println(key);
            }

            //关闭 reader 和 process
            reader.close();
            process.destroy();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
