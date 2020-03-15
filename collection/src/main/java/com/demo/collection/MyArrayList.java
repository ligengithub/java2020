package com.demo.collection;

import java.util.Arrays;

/**
 * @author ligen
 * @title: MyArrayList
 * @projectName java2020
 * @description: Arraylist 与 数组最大的区别就是数组不能动态扩容，这也是集合出现的原因
 * @date 2020/3/1113:29
 */
public class MyArrayList<T> {


    private static final int DEFAULT_CAPACITY = 3;
    private int capacity;
    private int size;
    private Object[] members;


    public MyArrayList() {
        this.size = 0;
        members = new Object[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
    }

    public void add(T t) {
        add(size, t);
    }

    public void add(int index, T t) {
        //如果实际大小等于数组容量，就进行两倍的扩容
        if (members.length == size) {
            //
            this.capacity = (this.capacity << 1) + this.capacity;
            Object[] temps = new Object[capacity];
            System.arraycopy(members, 0, temps, 0, members.length);
            members = temps;
        }
        for (int i = size; i > index; i--) {
            //数组元素从指定index位置右移一位
            members[i] = members[i - 1];
        }
        members[index] = t;
        //数组大小+1
        size++;
    }


    public Object get(int index) {
        return members[index];
    }


    /**
     * @ desc : 删除元素，注意要给没有引用的值赋null 好被垃圾回收
     * @ params
     * @ return
     * @ date 2020/3/12
     * @ author ligen
     */

    public Object remove(int index) {
        Object ret = members[index];
        for (int i = index + 1; i < size; i++) {
            members[index] = members[index + 1];
        }
        members[--size] = null;
        return ret;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            members[i] = null;
        }
        size = 0;
    }


    @Override
    public String toString() {
        return "MyArrayList{" +
                "size=" + size +
                ", members=" + Arrays.toString(members) +
                '}';
    }
}
