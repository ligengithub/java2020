package com.demo.annotation.testFrame;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ligen
 * @title: Main
 * @projectName java2020
 * @description: 通过自定义注解注解实现一个简单的测试框架，
 * 对添加注解的方法进行测试,不添加注解的则不测试
 * 并将测试结果输出到文件。
 * @date 2020/3/199:26
 */
public class Main {

    public static void main(String[] args) throws IOException {


//        FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\Users\\xx\\Desktop\\demo\\java2020\\annotation"));
        FileWriter fileWriter = new FileWriter(new File("./annotation/err.log"));


        // 通过反射获取到对象
        Class<TestDemo> class1 = TestDemo.class;
// 获取到方法；
        Method[] methods = class1.getMethods();

        for (Method method : methods) {
            // 若该方法被注解
            if (method.isAnnotationPresent(Check.class)) {
                // 执行方法
                try {
                    method.invoke(class1.newInstance());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    fileWriter.write("err->method:" + method.getName() + "---cause:" + e.getTargetException().getMessage()+"\r\n");
                }
            }
        }
        System.out.println("异常请查看 err.log");

        fileWriter.close();

    }

}
