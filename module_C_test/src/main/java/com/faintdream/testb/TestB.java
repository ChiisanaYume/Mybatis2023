package com.faintdream.testb;

import com.faintdream.a.AClass;
import com.faintdream.b.BClass;

public class TestB {
    public static void main(String[] args) {
        BClass bClass = new BClass();
        bClass.doSome();
        bClass.sayName();
        // 中文 中文

        AClass aClass = new AClass();
        aClass.sayHello();
        aClass.sayBye();
    }
}
