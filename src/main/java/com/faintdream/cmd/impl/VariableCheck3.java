package com.faintdream.cmd.impl;

import java.io.IOException;

public class VariableCheck3 extends  SafetyCheck{
    /**
     * 设置环境变量前的安全检查
     *
     * @param variable 变量名
     * @param value    变量值
     * @throws IOException 检查如果有风险项抛出IOException
     */
    @Override
    public void check(String variable, String value) throws IOException {

    }
}
