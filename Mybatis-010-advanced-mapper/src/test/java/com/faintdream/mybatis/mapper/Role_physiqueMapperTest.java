package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.Role_physique;
import com.faintdream.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Role_physiqueMapperTest {

    @Test
    public void selectByIdTest() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        Role_physiqueMapper mapper = sqlSession.getMapper(Role_physiqueMapper.class);

        Role_physique physique = mapper.selectById("6");
        System.out.println(physique);

    }

    @Test
    public void selectByIdCollection() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        Role_physiqueMapper mapper = sqlSession.getMapper(Role_physiqueMapper.class);

        Role_physique physique = mapper.selectByIdCollection("6");

        System.out.println(physique);
    }

    @Test
    public void selectByIdStepTest() throws IOException {

        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        Role_physiqueMapper mapper = sqlSession.getMapper(Role_physiqueMapper.class);

        Role_physique physique = mapper.selectByIdStep("1");
        System.out.println(physique);
    }


}
