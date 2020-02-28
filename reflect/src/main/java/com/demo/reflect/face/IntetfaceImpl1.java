package com.demo.reflect.face;

/**
 * @author ligen
 * @title: IntetfaceImpl1
 * @projectName reflect
 * @description:
 * @date 2020/2/2711:56
 */
public class IntetfaceImpl1 implements InterfaceA {
    public void method1() {
        System.out.println("impl1 method1 public");
    }

    protected void method2(){
        System.out.println("impl1 method2 protected");
    }

    private void method3(){
        System.out.println("impl1 method3 private");
    }

}
