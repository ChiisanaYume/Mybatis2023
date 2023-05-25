package com.faintdream.cmd.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VariableCheck2 extends SafetyCheck{
    /**
     * 设置环境变量前的安全检查
     *
     * @param variable 变量名
     * @param value    变量值
     * @throws IOException 检查如果有风险项抛出IOException
     */
    @Override
    public void check(String variable, String value) throws IOException {

        //调用系统命令执行set命令(/c不回显)
        Process process = Runtime.getRuntime().exec("cmd /c set");

        //读取命令行输出结果
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            // System.out.println("+++++++提取Key+++++++");
            String key = line.substring(0, line.indexOf("="));

            if (key.equalsIgnoreCase(variable)) {
                throw new IOException("Environment variable already exists!");
            }
        }

        //关闭 reader 和 process
        reader.close();
        process.destroy();

    }

}
