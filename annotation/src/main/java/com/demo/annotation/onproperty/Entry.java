package com.demo.annotation.onproperty;

/**
 * @author ligen
 * @title: Entry
 * @projectName java2020
 * @description:
 * @date 2020/3/1814:33
 */
public class Entry {

    @MyAno3("hahahhaha")
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "value='" + value + '\'' +
                '}';
    }
}
