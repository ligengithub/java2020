package com.demo.collection;

import java.util.LinkedList;

/**
 * @author ligen
 * @description:
 * @date 2019/12/2513:54
 */

public class MyArrayList {


    public static void main(String[] args) {

//        new Object()

        System.out.println((2>>1)+1);

        LinkedList<String> strings = new LinkedList<>();
        strings.add("aaa");
        strings.add("bbb");
        System.out.println( strings.get(1));
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
