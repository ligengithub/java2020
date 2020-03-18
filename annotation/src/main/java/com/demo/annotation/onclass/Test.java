package com.demo.annotation.onclass;

import com.demo.annotation.EnumDemo;
import com.demo.annotation.MyAno;

import java.util.Arrays;

/**
 * @author ligen
 * @title: Test
 * @projectName java2020
 * @description:
 * @date 2020/3/1813:36
 */

@MyAno2(a = 1, b = true, c = "xixi", d = @MyAno(), f = EnumDemo.B, e = {"1", "2"})
public class Test {

    public int a;

    public boolean b;

    public String c;

    public MyAno d;

    public EnumDemo f;

    public String[] e;


    @Override
    public String toString() {
        return "Test{" +
                "a=" + a +
                ", b=" + b +
                ", c='" + c + '\'' +
                ", d=" + d +
                ", f=" + f +
                ", e=" + Arrays.toString(e) +
                '}';
    }
}
