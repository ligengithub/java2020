package com.demo.decorator;

/**
 * @author ligen
 * @title: ComponentDecorator
 * @projectName java
 * @description:
 * @date 2020/8/1810:20
 */
public class ComponentDecorator implements Component {

    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void method1() {
        this.component.method1();
    }

    @Override
    public void method2() {
        this.component.method2();

    }
}
