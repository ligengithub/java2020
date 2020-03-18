package com.demo.annotation.onproperty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ligen
 * @title: MyAno3  添加在 Target= 属性  测试下 value
 * @projectName java2020
 * @description:
 * @date 2020/3/1813:30
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAno3 {

    // 属性返回值类型 可以是所有的基本类型
    String value() default "13412";

}
