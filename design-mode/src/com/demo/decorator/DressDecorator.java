package com.demo.decorator;

/**
 * @author ligen
 * @title: DecoratorA
 * @projectName java
 * @description:
 * @date 2020/8/1810:23
 */
public class DressDecorator extends PersonDecorator {


    public DressDecorator(Person component) {
        super(component);
    }



    @Override
    public void getUp() {
        super.getUp();
        System.out.println("穿衣服");
    }
}
