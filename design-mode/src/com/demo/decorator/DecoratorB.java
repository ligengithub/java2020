package com.demo.decorator;

/**
 * @author ligen
 * @title: DecoratorA
 * @projectName java
 * @description:
 * @date 2020/8/1810:23
 */
public class DecoratorB extends ComponentDecorator{


    public DecoratorB(Component component) {
        super(component);
    }

    @Override
    public void method1() {
        System.out.println("装饰器B 装饰方法1");
        super.method1();
    }

    @Override
    public void method2() {
        System.out.println("装饰器B 装饰方法2");
        super.method2();
    }
}
