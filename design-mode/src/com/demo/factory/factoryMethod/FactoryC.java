package com.demo.factory.factoryMethod;

/**
 * @author ligen
 * @title: FactoryB
 * @projectName java2020
 * @description:  专门生产ProductC对象的工厂
 * @date 2020/4/99:54
 */
public class FactoryC implements FactoryInterface {

    public Product createProduct() {
        return new ProductC();
    }
}
