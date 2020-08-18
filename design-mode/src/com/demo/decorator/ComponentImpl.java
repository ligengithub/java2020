package com.demo.decorator;

/**
 * @author ligen
 * @title: ComponentImpl
 * @projectName java
 * @description:
 * @date 2020/8/1810:30
 */
public class ComponentImpl implements Component{
    @Override
    public void method1() {
        System.out.println("原装方法1");
    }

    @Override
    public void method2() {
        System.out.println("原装方法2");
    }
}
