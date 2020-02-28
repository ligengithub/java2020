package com.demo.reflect.entry;

/**
 * @author ligen
 * @title: People
 * @projectName reflect
 * @description:
 * @date 2020/2/2415:59
 */
public class People {

    private String name;
    private Integer age;

    public People() {
        this.name = "defalult name";
        this.age = 0;
    }

    public People(Integer age) {
        this.age = age;
    }

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
