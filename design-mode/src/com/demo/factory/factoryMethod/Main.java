package com.demo.factory.factoryMethod;

/**
 * @author ligen
 * @title: Main
 * @projectName java2020
 * @description: 工厂方法模式
 * @date 2020/4/910:01
 */
public class Main {

    /**
     * @说明: 工厂方法模式，就是每个产品对应各自的工厂，
     *
     * 如果你新添加了一个产品，你需要新添加一个工厂来生产该类的对象
     *
     * 与简单工厂来说，它不需要修改工厂方法，符合开闭原则
     *
     * 缺点，产品较多的情况下，需要创建大量的工厂。
     *
     */


    public static void main(String[] args) {

        FactoryInterface factoryA = new FactoryA();
        FactoryInterface factoryB = new FactoryB();
        FactoryInterface factoryC = new FactoryC();


        factoryA.createProduct().getInfo();
        factoryB.createProduct().getInfo();
        factoryC.createProduct().getInfo();


    }


}
