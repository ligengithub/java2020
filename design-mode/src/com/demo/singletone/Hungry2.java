package com.demo.singletone;

/**
 * @author ligen
 * @description:
 * @date 2019/12/2513:54
 */

public class Hungry2 {

    // 初始化的时候就创建对象
    private static Hungry2 hungry;

    // 私有化构造方法，防止创建对象
    private Hungry2() {
    }

    static {
        hungry = new Hungry2();
    }

    // 获取实例方法
    public static Hungry2 getInstance() {
        return hungry;
    }

}
