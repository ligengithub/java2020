package com.demo.singleton;

/**
 * @author ligen
 * @title: Entry1
 * @projectName java2020
 * @description: 方式5 双重检查式
 * @date 2020/4/817:09
 */
public enum Entry6 {

    INSTANCE(1,"aaa");

    private Integer key;
    private String name;

    private Entry6(Integer key, String name) {
        this.key = key;
        this.name = name;
    }

    public void method() {
        System.out.println("枚举类方式创建单例");
    }

}
