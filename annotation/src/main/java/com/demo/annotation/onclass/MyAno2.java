package com.demo.annotation.onclass;

/**
 * @author ligen
 * @title: MyAno
 * @projectName java2020
 * @description:
 * @date 2020/3/1813:30
 */

import com.demo.annotation.EnumDemo;
import com.demo.annotation.MyAno;

import java.lang.annotation.*;

/**
 * @说明:  自定以注解实际上相当于 定义了一个接口实现了java.lang.annotation.Annotation 接口
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAno2 {

    // 属性返回值类型 可以是所有的基本类型
    int a();

    boolean b();

    // 引用类型
    String c();

    // 注解类型
    MyAno d();
    // 枚举类型
    EnumDemo f() default EnumDemo.A;
    // 数组类型,可以是上面任何一中类型的数组
    String[] e();
}
