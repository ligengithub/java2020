package com.demo.genericity.geninterface;

/**
 * @author ligen
 * @title: GenericityInterfaceImpl
 * @projectName genericity
 * @description:   当实现的接口的泛型的类型 不确定的时候 类也必须定义成泛型的，并且和接口的类型一致
 * @date 2020/2/2514:24
 */
public class GenericityInterfaceImpl3<T> implements GenericityInterfaceDemo<T> {

    public T method(T t) {
        return t;
    }
}
