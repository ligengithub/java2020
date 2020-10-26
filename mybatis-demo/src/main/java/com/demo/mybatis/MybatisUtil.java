package com.demo.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author ligen
 * @title: MybatisUtil
 * @projectName java
 * @description:
 * @date 2020/10/1315:09
 */
public class MybatisUtil {

    private static SqlSessionFactory getSqlSessionFactory() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        return new SqlSessionFactoryBuilder().build(reader);
    }

    public static SqlSession getSqlSession() throws IOException {
        //填写参数 true表示事务自动提交
        return getSqlSessionFactory().openSession(true);
    }

}
