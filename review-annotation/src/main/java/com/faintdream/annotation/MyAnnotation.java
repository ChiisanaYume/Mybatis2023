package com.faintdream.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 标识注解的注解 - 叫做元注解 @Target注解用来修饰@Component可以出现的位置。

// 以下表示@Component可以出现在类上，属性上
// @Target(value={ElementType.TYPE,ElementType.FIELD})

// 以下表示注解可以出现在类上
// @Target(value = {ElementType.TYPE})

// 在使用注解的时候，如果属性名是value的话，value可以省略
// @Target({ElementType.METHOD})

// 在使用注解的时候，如果属性值是数组，并且数组中只有一个元素，大括号可以省略
@Target(ElementType.TYPE)

//@Retention 也是一个元注解，用来标注@Component注解最终保留在class文件当中，并且可以被反射机制读取
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    // 定义注解的属性
    // String是属性类型
    // value是属性名
    String value();

    // 其他的属性
    // 属性类型String
    // 属性名是name
    //String name();

    // 数组类型
    // 属性类型是String[]
    // 属性名是names
    // String names();

    // int[] ages();

    // int age();
}
/*
确实，Java注解本身只是用于标注信息的一种机制，但结合反射机制，可以实现一些复杂的功能。

通过反射，可以在运行时获取注解的信息，并根据注解的内容执行相应的逻辑。
例如，可以通过反射检查类或方法上的注解，根据注解的配置执行特定的操作，如动态加载类、配置依赖注入、执行特定的业务逻辑等。

反射机制提供了获取类、方法、字段等元素的注解信息的能力，可以使用`Class`、`Method`、`Field`等反射API中的方法来获取注解对象，
并通过注解对象获取注解的属性值。然后可以根据注解的属性值来决定程序的行为或执行特定的逻辑。

总结起来，通过注解和反射的结合，可以实现动态配置、运行时处理和自定义行为等功能。这使得注解在Java开发中成为了一个强大而灵活的工具。
* */
