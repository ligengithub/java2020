package com.demo.genericity.genclass;

/**
 * @author ligen
 * @title: Main
 * @projectName genericity
 * @description:
 * @date 2020/2/2511:20
 */
public class Main {

    public static void main(String[] args) {

        // 泛型类
        GenenicityClassDemo2<String, Integer> gen = new GenenicityClassDemo2<String, Integer>();

        gen.setH(1);
        gen.setT("aa");

        System.out.println(gen.toString());


        // 泛型类 类型自定义
        GenenicityClassDemo2<Entry1, Integer> gen2 = new GenenicityClassDemo2<Entry1, Integer>(new Entry1().setA(1).setB("aa"), 1);
        System.out.println(gen2.toString());

    }

    /*
     * 泛型类的 主要功能就是将，成员变量泛型化。
     *  即，当成员变量有可能是不确定的类型的时候。我们可以使用泛型类。
     *
     * 即不同的类有共同的方法时，我们可以抽象出泛型类，来简化代码。
     *
     * 泛型类的应用场景主要是容器类型的类
     *  */


}
