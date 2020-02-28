package com.demo.genericity.geninterface;

/**
 * @author ligen
 * @title: GenericityInterfaceImpl
 * @projectName genericity 指定实现接口的泛型类型
 * @description:
 * @date 2020/2/2514:24
 */
public class GenericityInterfaceImpl implements GenericityInterfaceDemo<Integer> {

    public Integer method(Integer o) {
        return o;
    }
}
