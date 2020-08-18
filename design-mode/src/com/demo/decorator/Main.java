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


        ComponentImpl component = new ComponentImpl();

        DecoratorA decoratorA = new DecoratorA(component);
        DecoratorB decoratorB = new DecoratorB(decoratorA);

        decoratorB.method1();
        System.out.println();
        System.out.println();
        decoratorB.method2();

    }
}
