package com.demo.decorator;

/**
 * @author ligen
 * @title: ComponentDecorator
 * @projectName java
 * @description: 装饰器
 * @date 2020/8/1810:20
 */
public class PersonDecorator implements Person {

    private Person person;

    public PersonDecorator(Person person) {
        this.person = person;
    }


    @Override
    public void getUp() {
        this.person.getUp();
    }
}
