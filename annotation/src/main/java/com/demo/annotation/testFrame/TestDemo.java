package com.demo.annotation.testFrame;

/**
 * @author ligen
 * @title: TestDemo
 * @projectName java2020
 * @description:
 * @date 2020/3/199:29
 */
public class TestDemo {

    public String method1() {
        System.out.println("method1 被执行");
        return "method1";
    }

    @Check
    public int method2() {
        System.out.println("method2 被执行");
        return 7 / 0;
    }

    @Check
    public int method3() {
        System.out.println("method3 被执行");
        return 7 / 2;
    }

    @Check
    public int method4() {
        System.out.println("method4 被执行");
        return 7 / 0;
    }

    @Check
    public int method5() throws Exception {
        System.out.println("method5 被执行");
        throw new Exception("抛出异常，hhhhhhhhhhhhhh");
//        return 7 / 0;
    }

}
