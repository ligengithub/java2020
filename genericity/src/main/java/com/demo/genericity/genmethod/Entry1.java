package com.demo.genericity.genmethod;

/**
 * @author ligen
 * @title: Entry1
 * @projectName genericity
 * @description:
 * @date 2020/2/2517:44
 */
public class Entry1 {

    private String name;
    private Integer age;

    public Entry1() {
    }

    public Entry1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
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
        return "Entry1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
