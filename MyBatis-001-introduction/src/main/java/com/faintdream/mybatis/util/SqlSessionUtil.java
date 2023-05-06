package com.faintdream.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * MyBatis工具类(用于创建SqlSession对象)
 *
 * @author faintdream
 * @version 1.0
 * @since 1.0
 */

public class SqlSessionUtil {

    private SqlSessionUtil() {
    }

    private static SqlSession SqlSession;

    static {
        try {
            SqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml")).openSession();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static SqlSession openSqlSession() throws IOException {

        return SqlSession;
    }
}
