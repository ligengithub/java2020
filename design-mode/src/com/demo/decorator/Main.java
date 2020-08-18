package com.demo.decorator;

/**
 * @author ligen
 * @title: Main
 * @projectName java
 * @description: 装饰器设计模式
 * @date 2020/8/1810:22
 */
public class Main {

    public static void main(String[] args) {


        Zhangsan zhangsan = new Zhangsan();

        WashDecorator wash = new WashDecorator(zhangsan);
        DressDecorator dress = new DressDecorator(wash);
        dress.getUp();
    }
}
