package com.faintdream.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MyBatisIntroduction {

    public static void main(String... args) throws IOException {

        // 获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        // 获取SqlSessionFactory对象
        //InputStream is = new FileInputStream("mybatis-config.xml");
        //InputStream is = ClassLoader.getSystemResourceAsStream("mybatis-config.xml"); // 系统的类加载器

        InputStream is = Resources.getResourceAsStream("mybatis-config.xml"); // 默认从类的根路径获取流

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 执行SQL语句
        int count = sqlSession.insert("insertCar"); // 参数SQL语句的id；返回影响数据中的记录条数

        System.out.printf("插入了%d条记录。\n",count);

        // 默认不支持自动提交，需要手动提交
        sqlSession.commit();
    }
}
