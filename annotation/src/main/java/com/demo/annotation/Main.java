package com.demo.annotation;

import com.demo.annotation.onclass.MyAno2;
import com.demo.annotation.onclass.Test;
import com.demo.annotation.onproperty.Entry;
import com.demo.annotation.onproperty.MyAno3;

import java.lang.reflect.Field;
import java.util.Date;

/**
 * @author ligen
 * @title: Main
 * @projectName java2020
 * @description:
 * @date 2020/3/1613:41
 */
public class Main {

    /**
     * @ desc :    jdk5 定义了四个元注解，所谓元注解就是修饰注解的注解
     * <p>
     * 1.@Target,  定义 该注解修饰的范围
     * <p>
     * 　1.CONSTRUCTOR:用于描述构造器
     * 　　　　2.FIELD:用于描述域
     * 　　　　3.LOCAL_VARIABLE:用于描述局部变量
     * 　　　　4.METHOD:用于描述方法
     * 　　　　5.PACKAGE:用于描述包
     * 　　　　6.PARAMETER:用于描述参数
     * 　　　　7.TYPE:用于描述类、接口(包括注解类型) 或enum声明
     * <p>
     * 定义了target 之后，如果使用注解 标记的位置和Target指定的不一致会编译报错
     * <p>
     * 2.@Retention
     * 如果想在程序运行中获取注解的属性值，需要将起设置成RUNTIME
     * <p>
     * 1.SOURCE:在源文件中有效（即源文件保留）
     * 　　　　2.CLASS:在class文件中有效（即class保留）
     * 　　　　3.RUNTIME:在运行时有效（即运行时保留）
     * <p>
     * 3.@Documented  标记注解，标记之后，可以使用javaDoc 生成api文档
     * <p>
     * <p>
     * <p>
     * 4.@Inherited  可被继承  也是一个标记注解，如果你使用@Inherited 标记了一个注解A。
     * 那么被注解A 标注的类，的子类，也会被A标记。
     */


    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException {

        // 获取注解的值，需要使用反射。获取到class对象

        // 如果注解在什么位置，就调用class对象的对应方法，获取注解。得到注解的值

        // 注解在类上
        testAnoOnClass();

        // 注解在方法上
        testOnMethod();


        int day = new Date().getDay();

        @SuppressWarnings("deprecation")
        int day1 = new Date().getDay();

    }

    /**
     * @ desc : 测试注解在类上 ,获取注解的值，直接 class 类.getAnnotation()
     * @ params
     * @ return
     * @ date 2020/3/18
     * @ author ligen
     */
    public static void testAnoOnClass() throws IllegalAccessException, InstantiationException {
        Class<Test> testClass = Test.class;
        MyAno2 annotation = testClass.getAnnotation(MyAno2.class); // 获取类上的注解
        Test test = testClass.newInstance();
        test.a = annotation.a();
        test.b = annotation.b();
        test.c = annotation.c();
        test.d = annotation.d();
        test.e = annotation.e();
        test.f = annotation.f();
        System.out.println(test);
    }

    /**
     * @ desc : 测试注解在字段上，注意获取注解内容的时候，要使用Filed.getAnnotation()
     * 当注解的属性是value，，并且只又一个属性时。使用注解可以不用写属性名
     * 直接@MyAno（直接写即可）
     * @ params
     * @ return
     * @ date 2020/3/18
     * @ author ligen
     */
    public static void testOnMethod() throws NoSuchFieldException {
        Entry entry = new Entry();
        Field field = entry.getClass().getDeclaredField("value"); // 获取属性上的注解
        System.out.println(field.getAnnotation(MyAno3.class).value());
    }
}
