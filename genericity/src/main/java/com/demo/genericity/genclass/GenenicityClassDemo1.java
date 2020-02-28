package com.demo.genericity.genclass;

/**
 * @author ligen
 * @title: GenenicityClassDemo2
 * @projectName genericity
 * @description: 单个泛型
 * @date 2020/2/2511:19
 */
public class GenenicityClassDemo1<T> {

    private T t;

    public GenenicityClassDemo1() {
    }

    public GenenicityClassDemo1(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    public void method1(){
        System.out.println();
    }

    @Override
    public String toString() {
        return "GenenicityClassDemo1{" +
                "t=" + t +
                '}';
    }
}
