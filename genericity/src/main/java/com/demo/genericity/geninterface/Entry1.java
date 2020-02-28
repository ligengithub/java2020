package com.demo.genericity.geninterface;

/**
 * @author ligen
 * @title: Entry1
 * @projectName genericity
 * @description:
 * @date 2020/2/2514:25
 */
public class Entry1 {
    private Integer data;

    public Entry1(Integer data) {
        this.data = data;
    }

    public Entry1() {
        this.data = 0;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Entry1{" +
                "data=" + data +
                '}';
    }
}
