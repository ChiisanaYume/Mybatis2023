package com.faintdream.mybaties.util;

import com.faintdream.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.ResourceBundle;

public class SqlSessionUtilTest {

    @Test
    public void test1() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        System.err.println(sqlSession);

        SqlSessionUtil.close(sqlSession);
    }

    @Test
    public void test2() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));

        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession);
        SqlSessionUtil.close(sqlSession);
    }

    @Test
    public void test3(){
        System.out.println(String.class);
        System.out.println(Number.class);
        String s = "Amber";
        System.out.println(s.getClass());


    }
}
