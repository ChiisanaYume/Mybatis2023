package com.faintdream.mybatis.util;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

public class SqlSessionUtilTest {

    @Test
    public void Test1() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        System.err.println(sqlSession);


    }
}
