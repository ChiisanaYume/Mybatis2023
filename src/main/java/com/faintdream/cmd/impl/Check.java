package com.faintdream.cmd.impl;

import java.io.IOException;

/*添加环境变量前的安全检查项*/
public interface Check {

    /**
     * 设置环境变量前的安全检查
     * @param variable 变量名
     * @param value    变量值
     * @throws IOException 检查如果有风险项抛出IOException
     * */
    void check(String variable, String value) throws IOException;

    /**
     * 设置下个安全检查的类名
     * @param nextCheck 下一个安全检查项目
     * */
    void setNextCheck(Check nextCheck);

}
