package com.demo.collection;

/**
 * @author ligen
 * @description:
 * @date 2019/12/2513:54
 */

public class Test {

    public static void main(String[] args) {

        MyArrayList<Integer> mylist = new MyArrayList<Integer>();

        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(3);
        mylist.add(3);
        mylist.add(3);
        System.out.println(mylist.get(1));   //2
        mylist.remove(1);
        mylist.remove(0);
        mylist.add(2);

        System.out.println(mylist.toString());  // 3 2
        mylist.add(1,4);
        System.out.println(mylist.toString());   // 3 4 2


        mylist.clear();

        System.out.println(mylist.toString());  // []
//        System.out.println(my);




//        System.out.println("hahhahah");
    }

}