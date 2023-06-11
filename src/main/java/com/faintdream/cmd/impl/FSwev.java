package com.faintdream.cmd.impl;

import com.faintdream.cmd.Swev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FSwev implements Swev {
    private static int varDefaultType = USER_VARIABLE;
    private final List<String> processOutputStreams = new LinkedList<>();
    private final List<String> ProcessErrStreams = new LinkedList<>();
    public FSwev() {
    }

    public static int getVarDefaultType() {
        return varDefaultType;
    }

    public static void setVarDefaultType(int varType) throws IOException {
        if (varType == 1 || varType == 0) {
            varDefaultType = varType;
        } else {
            throw new IOException("The parameter can only be 0(SYSTEM_VARIABLE) or 1(USER_VARIABLE).");
        }
    }

    /*getter&setter*/

    /**
     * 设置环境变量
     *
     * @param variable 变量名
     * @param value    变量值
     * @return true 设置成功，false设置失败;
     * @throws IOException IO异常
     */
    @Override
    public boolean set(String variable, String value) throws IOException {

        Process process = null;
        try {

            // 设置环境变量前的安全检查
            check(variable, value);

            // 设置环境变量
            String[] command = {"cmd", "/c", "setX", "/m", variable, value};
            if (varDefaultType == USER_VARIABLE) {
                command = new String[]{"cmd", "/c", "setX", variable, value};
            }
            process = Runtime.getRuntime().exec(command);

            // 处理命令输出流
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                processOutputStreams.add(line);
            }

            // 处理命令错误流
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while ((line = errorReader.readLine()) != null) {
                ProcessErrStreams.add(line);
            }

            // 等待命令执行完成
            int exitCode = process.waitFor();

            if (exitCode != 0) {
                throw new IOException("Failed to set environment variable!");
            }
        } catch (InterruptedException | IOException e) {
            throw new IOException(e);
        } finally {
            if (process != null) {
                process.destroy();
            }

        }

        // 没有异常证明程序正常执行，返回true
        return true;
    }

    /**
     * 设置环境变量
     *
     * @param variable     变量名
     * @param value        变量值
     * @param variableType 变量类型(系统变量(SYSTEM_VARIABLE 0)，用户变量(USER_VARIABLE 1))
     * @return true 设置成功，false设置失败;
     * @throws IOException IO异常
     */
    @Override
    public boolean set(String variable, String value, final int variableType) throws IOException {

        int temp = getVarDefaultType();
        boolean res;
        try {
            setVarDefaultType(variableType);
            res = set(variable, value);
        } catch (IOException e) {
            throw new IOException(e);
        } finally {
            setVarDefaultType(temp);
        }
        return res;

    }

    /**
     * 设置环境变量前的安全检查
     *
     * @param variable 变量名
     * @param value    变量值
     * @throws IOException 检查如果有风险项抛出IOException
     */
    private void check(String variable, String value) throws IOException {
        new VariableCheck2().check(variable, value);
    }

    public List<String> getProcessOutputStreams() {
        return processOutputStreams;
    }

    public List<String> getProcessErrStreams() {
        return ProcessErrStreams;
    }

    /**
     * 检查环境变量是否已经存在存在
     */
    @Deprecated
    private static class VariableCheck1 extends SafetyCheck {
        /**
         * 设置环境变量前的安全检查
         *
         * @param variable 变量名
         * @param value    变量值
         * @throws IOException 检查如果有风险项抛出IOException
         */
        @Override
        public void check(String variable, String value) throws IOException {

            // 查询是否已经存在这个环境变量(有错误getenv()并不能获取所有环境变量)
            Map<String, String> env = System.getenv();
            for (String key : env.keySet()) {
                if (key.equalsIgnoreCase(variable)) {
                    throw new IOException("Environment variable already exists!");
                }
            }
        }
    }
}
