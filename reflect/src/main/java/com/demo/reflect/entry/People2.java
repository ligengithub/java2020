package com.demo.reflect.entry;

/**
 * @author ligen
 * @title: People2
 * @projectName reflect
 * @description:  测试一下  一个不被使用的类  会不会被编译成class 字节码文件
 * @date 2020/2/279:56
 */
public class People2 {
    private String name;
    private Integer age;


    public People2(String name) {
        this.name = name;
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

    public void method(){

        System.out.println("People2 method");
    }

    public void method2(String data){

        System.out.println("People2 method 带参数"+data);
    }

    @Override
    public String toString() {
        return "People2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
