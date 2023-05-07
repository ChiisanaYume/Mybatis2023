package com.faintdream.mybatis;

import com.faintdream.mybatis.pojo.Car;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * 测试mybatis配置文件
 *
 * @author faintdream
 * @version 1.0
 * @since 1.0
 */
public class configurationTest {

    @Test
    public void connection02Test() throws IOException {

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //创建SqlSessionFactory对象(一个Mapper对应一个SqlSessionFactory,不要重复创建)
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));

        //创建 10个 SqlSession对象
        for (int a = 0; a < 5; a++) {
            SqlSession sqlSession = sqlSessionFactory.openSession();

            //插入测试
            insertTest(sqlSession);

            //查询测试
            selectTest(sqlSession);

            //不要关闭(测试需要)
            //sqlSession.close();
        }



    }

    /**
     * 测试数据源数据连接对象
     * 在使用连接的时候 两次执行openSession()创建的连接对象是相同的一个对象
     * 不是用连接池的时候 两次执行openSession()创建的对象是不同的对象
     */
    @Test
    public void connectionTest() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        //创建SqlSession对象
        SqlSessionFactory sqlSessionFactory1 = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession1 = sqlSessionFactory1.openSession();

        //查询测试
        selectTest(sqlSession1);

        //插入测试
        insertTest(sqlSession1);
        sqlSession1.close();

        ///////////////////////////////////////////////////

        //创建SqlSession对象
        SqlSessionFactory sqlSessionFactory2 = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession2 = sqlSessionFactory2.openSession();

        //查询测试
        selectTest(sqlSession2);

        //插入测试
        insertTest(sqlSession2);
        sqlSession2.close();

    }

    @Test
    public void configurationTest01() throws IOException {

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        //使用默认数据库环境
        SqlSessionFactory sqlSessionFactory1 = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession1 = sqlSessionFactory1.openSession();
        System.out.println(sqlSession1);

        //查询测试
        selectTest(sqlSession1); //成功查询
        //插入测试
        insertTest(sqlSession1); //成功插入
        //指定数据库环境
        SqlSessionFactory sqlSessionFactory2 = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"), "genshin");
        SqlSession sqlSession2 = sqlSessionFactory2.openSession();
        System.out.println(sqlSession2);

        //查询测试(失败)
        try {
            selectTest(sqlSession2); //找不到数据库
        } catch (Exception e) {
            e.printStackTrace();
        }


        //插入测试(失败)
        try {
            insertTest(sqlSession2); //找不到数据库
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void selectTest(SqlSession s) {
        List<Car> cars = s.selectList("com.faintdream.car.selectCarAll");
        for (Car car : cars) {
            System.err.println(car);// 为了输出更显眼，使用err
        }
    }

    private void insertTest(SqlSession s) {
        Car car = new Car("1011", "比亚迪海豹", "11", "2023-02-02", "电动车");
        int count = s.insert("com.faintdream.car.insertCar", car);
        s.commit();
        System.err.println("插入条数:" + count);
    }
}
