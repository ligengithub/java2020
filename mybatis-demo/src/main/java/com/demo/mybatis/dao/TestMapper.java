package com.demo.mybatis.dao;


import com.demo.mybatis.domain.Person;

/**
 * @author ligen
 * @title: TestMapper
 * @projectName java
 * @description:
 * @date 2020/10/1311:35
 */
public interface TestMapper {

   Person getPersonById(Integer id);

}
