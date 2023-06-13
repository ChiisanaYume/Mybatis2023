package com.faintdream;

import com.faintdream.mybatis.pojo.Car;
import com.faintdream.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试MyBatis 数据库CRUD
 *
 * @version 1.0
 * @Author faintdream
 * @since 1.0
 */
public class CarMapperTest {

    /**
     * 查询所有
     * */
    @Test
    public void carSelectAll() {

        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionUtil.openSqlSession();

            List<Car> carList = sqlSession.selectList("selectCarAll");

            carList.forEach(car -> System.out.println(car));


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            // 释放资源
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    /**
     * 根据id查询1条记录
     * */
    @Test
    public void carSelectById() {

        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionUtil.openSqlSession();

            Car car = sqlSession.selectOne("selectCarById", 1);

            System.out.println(car);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            // 释放资源
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    /**
     * 更新
     * */
    @Test
    public void carUpdate() {
        SqlSession sqlSession = null;

        try {
            sqlSession = SqlSessionUtil.openSqlSession();

            Car car = new Car(24L, "1010", "别克英朗", "10", "2023-05-01", "燃油车");

            int count = sqlSession.update("updateById", car);

            sqlSession.commit();

            System.out.println("修改成功，修改数据:" + count);

        } catch (Exception e) {

            // 回滚事务
            if (sqlSession != null) {
                sqlSession.rollback();
            }
        } finally {

            // 释放资源
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    /**
     * 删除
     * */
    @Test
    public void carDelete() {
        SqlSession sqlSession = null;

        try {
            sqlSession = SqlSessionUtil.openSqlSession();

            int count = sqlSession.delete("deleteById", 27);

            sqlSession.commit();

            System.out.println("删除成功，删除数据:" + count);

        } catch (Exception e) {

            // 回滚事务
            if (sqlSession != null) {
                sqlSession.rollback();
            }
        } finally {

            // 释放资源
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    /**
     * 插入
     */
    @Test
    public void carInsertByPojo() {
        SqlSession sqlSession = null;

        try {
            sqlSession = SqlSessionUtil.openSqlSession();

            Car car = new Car("1009", "雪铁龙C6", "12", "2023-04-01", "燃油车");

            int count = sqlSession.insert("insertCar", car);

            sqlSession.commit();

            System.out.println("插入成功，插入数据:" + count);

        } catch (Exception e) {

            // 回滚事务
            if (sqlSession != null) {
                sqlSession.rollback();
            }
        } finally {

            // 释放资源
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void carInsert() {

        SqlSession sqlSession = null;

        try {
            sqlSession = SqlSessionUtil.openSqlSession();

            Map<String, Object> map = new HashMap<>();

            map.put("car_num", "1008");
            map.put("brand", "比亚迪汉plus");
            map.put("guide_price", 25);
            map.put("produce_time", "2023-05-06");
            map.put("car_type", "电动车");

            int count = sqlSession.insert("insertCar", map);

            sqlSession.commit();

            System.out.println("插入成功，插入数据:" + count);
        } catch (Exception e) {

            // 回滚事务
            if (sqlSession != null) {
                sqlSession.rollback();
            }

        } finally {

            // 释放资源
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
