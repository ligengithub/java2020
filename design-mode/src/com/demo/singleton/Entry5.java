package com.demo.singleton;

/**
 * @author ligen
 * @title: Entry1
 * @projectName java2020
 * @description: 方式5 双重检查式
 * @date 2020/4/817:09
 */
public class Entry5 {

    private static Entry5 entry5;

    private Entry5() {

    }

    public static Entry5 getEntry() {
        if (entry5 == null) {
            synchronized ("lock") {
                if (entry5 == null) {
                    entry5 = new Entry5();
                }
            }
        }
        return entry5;
    }
}
