package com.demo.genericity.genmethod;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ligen
 * @title: GenericityMethodDemo1
 * @projectName genericity
 * @description:
 * @date 2020/2/2517:36
 */
public class GenericityMethodDemo1 {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        method1(new Integer(1));


        // 这里传入 Entry1 类型，则返回类型只能是Entry1
        Entry1 ligen = method1(new Entry1("ligen", 10));

//        System.out.println(test.toString());
    }


    /**
     * @ desc : 一个静态吧方法使用泛型参数，，那么这个静态方法必须定义为泛型方法
     * @ params [t]
     * @ return T
     * @ date 2020/2/25
     * @ author ligen
     */
    public static <T> T method1(T t) throws IllegalAccessException, InstantiationException {

        Class aClass = t.getClass();
        System.out.println(aClass.getName());
        System.out.println(t);

        return null;
    }


    /**
     * @ desc :  一般来说，泛型方法主要作用是，将参数泛型化，做一些操作。
     * @ params
     * @ return
     * @ date 2020/2/25
     * @ author ligen
     */
    public static <T> List<T> method2() {

        return new ArrayList<T>();
    }

}
