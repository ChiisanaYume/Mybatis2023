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
 * @version 1.1
 * @since 1.0
 */

public class SqlSessionUtil {

    private SqlSessionUtil() {
    }

    private static final SqlSessionFactory SQL_SESSION_FACTORY;
    private static final ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();

    static {
        try {
            SQL_SESSION_FACTORY = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static SqlSession openSqlSession() throws IOException {
        SqlSession sqlSession = threadLocal.get();
        if (sqlSession == null) {
            sqlSession = SQL_SESSION_FACTORY.openSession();
            threadLocal.set(sqlSession);
        }
        return sqlSession;
    }



    public static void close(SqlSession sqlSession){
        if(sqlSession!=null){
            try {
                sqlSession.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        threadLocal.remove();
    }

}
