package com.faintdream.mybatis;

import com.faintdream.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.io.IOException;

public class CarMapperTest {
    @Test
    public void carMapperByUtilTest() {

        SqlSession sqlSession = null;

        try {
            sqlSession = SqlSessionUtil.openSqlSession();

            // 执行sql语句，处理相关业务
            int count = sqlSession.insert("insertCar");
            System.out.printf("插入了%d条语句。\n", count);

            //执行到这里，没有发生任何异常，提交事务，中止事务
            sqlSession.commit();

        } catch (Exception e) {
            // 回滚异常
            if (sqlSession != null) {
                sqlSession.rollback();
            }
        } finally {
            //关闭会话(释放资源)
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void carMapperTest() {
        SqlSession sqlSession = null;


        try {
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));

            // 开启会话(底层开始事务)
            sqlSession = sqlSessionFactory.openSession();

            // 执行sql语句，处理相关业务
            int count = sqlSession.insert("insertCar");
            System.out.printf("插入了%d条语句。\n", count);

            //执行到这里，没有发生任何异常，提交事务，中止事务
            sqlSession.commit();

        } catch (Exception e) {
            // 回滚异常
            if (sqlSession != null) {
                sqlSession.rollback();
            }
        } finally {
            //关闭会话(释放资源)
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
