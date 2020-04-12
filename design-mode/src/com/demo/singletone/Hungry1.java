package com.demo.singletone;

/**
 * @author ligen
 * @description:
 * @date 2019/12/2513:54
 */

public class Hungry1 {

    // 初始化的时候就创建对象
    private static Hungry1 hungry = new Hungry1();

    // 私有化构造方法，防止创建对象
    private Hungry1(){}

    // 获取实例方法
    public static Hungry1 getInstance(){
        return hungry;
    }

}
