package com.demo.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author ligen
 * @description:
 * @date 2019/12/2513:54
 */

public class Test2 {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        int num = 10000000;
        long tim1 = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            list1.add(i);
        }
        long tim2 = System.currentTimeMillis();
        list1.add(2,2);
        long tim3 = System.currentTimeMillis();
        list1.add(num-1,num-1);
        long tim4 = System.currentTimeMillis();

        System.out.println("ArrayList 插入"+num+"条数据耗时:"+String.valueOf(tim2-tim1));
        System.out.println("ArrayList 头部插入数据耗时:"+String.valueOf(tim3-tim2));
        System.out.println("ArrayList 尾部插入数据耗时:"+String.valueOf(tim4-tim3));


        long tim5 = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            list2.add(i);
        }
        long tim6 = System.currentTimeMillis();
         list2.add(2,2);
        long tim7 = System.currentTimeMillis();
        list2.add(num-1,num-1);
        long tim8 = System.currentTimeMillis();
        System.out.println("LinkedList 插入"+num+"条数据耗时:"+String.valueOf(tim6-tim5));
        System.out.println("LinkedList 头部插入数据耗时:"+String.valueOf(tim7-tim6));
        System.out.println("LinkedList 尾部插入数据耗时:"+String.valueOf(tim8-tim6));


        // 查找。取出
        long tim9 = System.currentTimeMillis();
        list1.get(num/num);
        long tim10 = System.currentTimeMillis();
        System.out.println("ArrayList 头部取出数据耗时:"+String.valueOf(tim10-tim9));

        list1.get(num / 2);
        long tim11 = System.currentTimeMillis();
        System.out.println("ArrayList 中部取出数据耗时:"+String.valueOf(tim11-tim10));

        list1.get(num);
        long tim12 = System.currentTimeMillis();
        System.out.println("ArrayList 尾部取出数据耗时:"+String.valueOf(tim12-tim11));

        list2.get(num/num);
        long tim13 = System.currentTimeMillis();
        System.out.println("LinkedList 头部取出数据耗时:"+String.valueOf(tim13-tim12));

        list2.get(num / 2);
        long tim14 = System.currentTimeMillis();
        System.out.println("LinkedList 中部取出数据耗时:"+String.valueOf(tim14-tim13));


        list2.get(num);
        long tim15 = System.currentTimeMillis();
        System.out.println("LinkedList 尾部取出数据耗时:"+String.valueOf(tim15-tim14));

    }

}