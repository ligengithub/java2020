package com.demo.genericity.genclass;

/**
 * @author ligen
 * @title: Entry1
 * @projectName genericity
 * @description:
 * @date 2020/2/2511:31
 */
public class Entry1 {
    private Integer a;
    private String b;

    public Entry1() {
    }

    public Integer getA() {
        return a;
    }

    public Entry1 setA(Integer a) {
        this.a = a;
        return this;
    }

    public String getB() {
        return b;
    }

    public Entry1 setB(String b) {
        this.b = b;
        return this;
    }

    @Override
    public String toString() {
        return "Entry1{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }
}
