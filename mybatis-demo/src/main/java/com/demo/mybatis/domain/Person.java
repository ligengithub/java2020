package com.demo.mybatis.domain;

import java.util.Date;

/**
 * @author ligen
 * @title: Person
 * @projectName java
 * @description:
 * @date 2020/10/1311:39
 */
public class Person {

    private Integer id;

    private String name;

    private Integer age;

    private Date birth;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
