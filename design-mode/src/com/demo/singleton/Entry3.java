package com.demo.singleton;

/**
 * @author ligen
 * @title: Entry1
 * @projectName java2020
 * @description: 方式1   懒汉式1
 * @date 2020/4/817:09
 */
public class Entry3 {

    private static Entry3 entry3;


    private Entry3() {

    }

    static Entry3 getEntry() {
        synchronized ("lock") {
            if (entry3 == null) {
                entry3 = new Entry3();
                return entry3;
            } else {
                return entry3;
            }
        }

    }
}
