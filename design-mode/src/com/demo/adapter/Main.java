package com.demo.adapter;

import com.demo.adapter.main.MainInterFace;
import com.demo.adapter.main.MainInterFaceImpl;

/**
 * @author ligen
 * @title: Main
 * @projectName java
 * @description:
 * @date 2020/6/1118:07
 */
public class Main {


    /**
     * @说明: 适配器模式核心   创建一个类， 实现自己的接口，，，继承别人的实现类，
     * 实现方法中，通过重写自己接口方法，来将别人的数据格式和自己接口的数据格式进行适配
     */

    public static void main(String[] args) {

        // 这就是自己的
        MainInterFace main = new MainInterFaceImpl();


        // 这是拿别人的，适配成自己的
        MainInterFace afterAdapt = new MainAdapter();


        System.out.println(main.getName());
        System.out.println(afterAdapt.getName());


    }


}
