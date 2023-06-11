package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.Role_physique;
import com.faintdream.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Role_physiqueMapperTest {

    @Ignore
    private void showPhysique(List<Role_physique> list) {
        for (Role_physique physique : list) {
            System.err.println(physique);
        }
    }

    @Ignore
    private void showPhysique(Role_physique role_physique) {
        List<Role_physique> list = new ArrayList<>();
        list.add(role_physique);
        showPhysique(list);
    }

    @Test
    public void selectAllTest() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        Role_physiqueMapper mapper = sqlSession.getMapper(Role_physiqueMapper.class);

        List<Role_physique> list = mapper.selectAll();
        showPhysique(list);
    }

    @Test
    public void selectByIdTest() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        Role_physiqueMapper mapper = sqlSession.getMapper(Role_physiqueMapper.class);

        Role_physique physique = mapper.selectById("6");
        showPhysique(physique);
    }

    @Test
    public void cacheTest1() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        Role_physiqueMapper mapper = sqlSession.getMapper(Role_physiqueMapper.class);

        Role_physique physique1 = mapper.selectById("6");
        showPhysique(physique1);

        Role_physique physique2 = mapper.selectById("6");
        showPhysique(physique2);

        Role_physique physique3 = mapper.selectById("4");
        showPhysique(physique3);
    }

    /*不同的sqlSession*/
    @Test
    public void cacheTest2() throws IOException {

        SqlSession sqlSession1 = SqlSessionUtil.openSqlSession();
        Role_physiqueMapper mapper1 = sqlSession1.getMapper(Role_physiqueMapper.class);
        Role_physique physique1 = mapper1.selectById("6");
        showPhysique(physique1);
        SqlSessionUtil.close(sqlSession1);

        SqlSession sqlSession2 = SqlSessionUtil.openSqlSession();
        Role_physiqueMapper mapper2 = sqlSession2.getMapper(Role_physiqueMapper.class);
        Role_physique physique2 = mapper2.selectById("6");
        showPhysique(physique2);
        SqlSessionUtil.close(sqlSession2);

        SqlSession sqlSession3 = SqlSessionUtil.openSqlSession();
        Role_physiqueMapper mapper3 = sqlSession3.getMapper(Role_physiqueMapper.class);
        Role_physique physique3 = mapper3.selectById("6");
        showPhysique(physique3);
        SqlSessionUtil.close(sqlSession3);
    }

    /*手动清空一级缓存*/
    @Test
    public void cacheTest3() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        Role_physiqueMapper mapper = sqlSession.getMapper(Role_physiqueMapper.class);
        Role_physique physique1 = mapper.selectById("2");
        showPhysique(physique1);

        // 手动清空一级缓存
        sqlSession.clearCache();

        // 没有了缓存，直接从数据库拿数据
        Role_physique physique2 = mapper.selectById("2");
        showPhysique(physique2);


    }

    /*执行任何一条insert,update,delete语句都会制动清空缓存*/
    @Test
    public void cacheTest4() throws IOException {
        SqlSession sqlSession1 = SqlSessionUtil.openSqlSession();
        Role_physiqueMapper mapper = sqlSession1.getMapper(Role_physiqueMapper.class);
        Role_physique physique1 = mapper.selectById("2");
        showPhysique(physique1);

        // 执行任何一条insert,update,delete语句都会制动清空缓存
        int insert = mapper.insert(new Role_physique("8","Toddler","幼女"));
        System.err.println(insert == 1 ? "插入成功" : "插入失败");
        // sqlSession.commit();

        // 没有了缓存，直接从数据库拿数据
        Role_physique physique2 = mapper.selectById("2");
        showPhysique(physique2);
    }

    /*二级缓存*/
    @Test
    public void cacheTest5() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis-config.xml"));

        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        Role_physiqueMapper mapper1 = sqlSession1.getMapper(Role_physiqueMapper.class);
        Role_physique physique1 = mapper1.selectById("4");
        showPhysique(physique1);

        // 如果不关闭sqlSession1的话,二级缓存是没有数据的
        sqlSession1.close();

        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        Role_physiqueMapper mapper2 = sqlSession2.getMapper(Role_physiqueMapper.class);
        Role_physique physique2 = mapper2.selectById("4");
        showPhysique(physique2);
        sqlSession2.close();
    }

}
