package com.faintdream.cmd.impl;

import java.io.IOException;

abstract public class SafetyCheck implements Check {
    private Check nextCheck;

    /**
     * 执行下一个检查
     *
     * @param variable 变量名
     * @param value    变量值
     * @throws IOException 检查如果有风险项抛出IOException
     */
    public void nextCheck(String variable, String value) throws IOException {
        if (nextCheck != null) {
            nextCheck.check(variable, value);
        }
    }

    /**
     * 设置下个安全检查的类名
     *
     * @param nextCheck 下一个安全检查项目
     */
    @Override
    public void setNextCheck(Check nextCheck) {
        this.nextCheck = nextCheck;
    }
}
