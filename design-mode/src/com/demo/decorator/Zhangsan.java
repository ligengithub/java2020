package com.demo.decorator;

/**
 * @author ligen
 * @title: ComponentImpl
 * @projectName java
 * @description:
 * @date 2020/8/1810:30
 */
public class Zhangsan implements Person {



    @Override
    public void getUp() {
        System.out.println("我是:张三"+",我起床了");
    }
}
