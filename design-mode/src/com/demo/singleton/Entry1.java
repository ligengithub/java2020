package com.demo.singleton;

/**
 * @author ligen
 * @title: Entry1
 * @projectName java2020
 * @description: 方式1   饿汉式，构造方法式
 * @date 2020/4/817:09
 */
public class Entry1 {

    private static Entry1 entry1;

    private Entry1() {
        entry1 = new Entry1();
    }

    static Entry1 getEntry() {
        return entry1;
    }
}
