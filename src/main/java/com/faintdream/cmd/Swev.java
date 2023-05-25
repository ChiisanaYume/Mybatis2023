package com.faintdream.cmd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * 设置Window环境变量(Set Window Environment Variable)
 */
public interface Swev {

    int USER_VARIABLE = 1;
    int SYSTEM_VARIABLE = 0;

    /**
     * 设置环境变量
     *
     * @param variable 变量名
     * @param value    变量值
     * @return true 设置成功，false设置失败;
     * @throws IOException IO异常
     */
    boolean set(String variable, String value) throws IOException;

    /**
     * 设置环境变量
     *
     * @param variable     变量名
     * @param value        变量值
     * @param variableType 变量类型(系统变量(SYSTEM_VARIABLE 0)，用户变量(USER_VARIABLE 1))
     * @return true 设置成功，false设置失败;
     * @throws IOException IO异常
     */
    boolean set(String variable, String value, final int variableType) throws IOException;
}
