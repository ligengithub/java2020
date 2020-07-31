package com.demo.spi;

/**
 * @author ligen  自己拓展 jar 包中的方法
 * @title: MyExpand
 * @projectName java
 * @description:
 * @date 2020/7/309:24
 */
public class MyExpand implements InterfaceDemo {
    @Override
    public void method1() {
        System.out.println("expand method1");
    }

    @Override
    public void method2() {
        System.out.println("expand method2");
    }

    @Override
    public void method3() {
        System.out.println("expand method3");
    }
}
