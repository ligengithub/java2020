package com.demo.genericity.generase;

import java.util.ArrayList;

/**
 * @author ligen
 * @description:
 * @date 2019/12/2513:54
 */

public class Demo2 {

    public static void main(String[] args) {

        method(1, "string");  // 擦除的结果为Object
        method(1, 2L);      // 擦除的结果为Number
        method(1, 2.4f);    // 擦除的结果为Num
        method(1, 2);    // 擦除的结果为Integer


        // 类型检查  当对象的引用的时候才会触发。 创建泛型对象的时候不会触发

        ArrayList<String> strings = new ArrayList<>();

//        strings.add(123);  在调用add方法的时候触发类型检查

        ArrayList strings1 = new ArrayList<String>();  // 还是Object类型
        strings1.add(1);  //没有指定，还是Object 类型。
        strings1.add("1");


    }

    /**
     * @ desc : 泛型方法的参数，多个参数，编译擦除为多个参数的最小父级类型
     * @ params
     * @ return
     * @ date 2020/3/8 0008
     * @ author ligen
     */
    public static <T, H> void method(T t, H h) {
        System.out.println(t);
        System.out.println(h);

    }


}
