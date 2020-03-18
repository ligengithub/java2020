package com.demo.annotation;

/**
 * @author ligen
 * @title: MyAno
 * @projectName java2020
 * @description:
 * @date 2020/3/1813:30
 */

public @interface MyAno {

    // 属性返回值类型 可以是所有的基本类型
    int a() default 0;

    boolean b() default true;

    // 引用类型
    String c() default "c";

}
