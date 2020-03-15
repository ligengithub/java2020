package com.demo.genericity.generase;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author ligen
 * @description:
 * @date 2019/12/2513:54
 */

public class Erase {


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        // 1 Integer 类型的list 和String 类型的list 经过编译之后都会变成Object类型的。
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println(list1.getClass());
        System.out.println(list2.getClass());
        System.out.println(list1.getClass() == list2.getClass());


        // 反射添加元素.。可以添加进去不同的元素
        Class<? extends ArrayList> aClass = list1.getClass();
        Method method = aClass.getMethod("add", Object.class);
        method.invoke(list1, "abc");
        method.invoke(list1, 123);

    }

}
