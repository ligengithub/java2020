package com.demo.singletone;

/**
 * @author ligen
 * @description:
 * @date 2019/12/2513:54
 */

public class Test {

    public static void main(String[] args) {
        test1();
        test2();

    }


    /**
     * 懒汉式:  静态变量方式
     */
    private static void test1() {
        System.out.println(Hungry1.getInstance());
        System.out.println(Hungry1.getInstance());
    }

    /**
     * 懒汉式:  静态代码块
     */
    private static void test2() {
        System.out.println(Hungry2.getInstance());
        System.out.println(Hungry2.getInstance());
    }
}
