package com.demo.mybatis;


import com.demo.mybatis.dao.TestMapper;
import com.demo.mybatis.domain.Person;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import java.io.IOException;

/**
 * @author ligen
 * @title: com.demo.mybatis.MybatisDemo
 * @projectName java
 * @description:
 * @date 2020/10/1311:33
 */
public class MybatisDemo {

    public static void main(String[] args) {
//        DataSource dataSource = BlogDataSourceFactory.getBlogDataSource();
//        TransactionFactory transactionFactory = new JdbcTransactionFactory();
//        Environment environment = new Environment("development", transactionFactory, dataSource);
//        Configuration configuration = new Configuration(environment);
//        configuration.addMapper(TestMapper.class);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);


        try (SqlSession session = MybatisUtil.getSqlSession()) {
            // 你的应用逻辑代码
//            SqlSession sqlSession = sqlSessionFactory.openSession();
            TestMapper mapper = session.getMapper(TestMapper.class);
            Person person = mapper.getPersonById(1);

        } catch (IOException e) {
//            s
            e.printStackTrace();
        }


    }
}
