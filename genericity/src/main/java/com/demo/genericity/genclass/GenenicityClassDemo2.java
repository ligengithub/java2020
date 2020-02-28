package com.demo.genericity.genclass;

/**
 * @author ligen
 * @title: GenenicityClassDemo2
 * @projectName genericity
 * @description: 泛型类  多个泛型
 * @date 2020/2/2511:19
 */
public class GenenicityClassDemo2<T,H> {

    private T t;
    private H h;

    public GenenicityClassDemo2() {
    }

    public GenenicityClassDemo2(T t, H h) {
        this.t = t;
        this.h = h;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public H getH() {
        return h;
    }

    public void setH(H h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "GenenicityClassDemo2{" +
                "t=" + t +
                ", h=" + h +
                '}';
    }
}
