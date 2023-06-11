package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.Genshin_role_detail;
import com.faintdream.mybatis.util.MapperFactory;
import com.faintdream.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Genshin_role_detailMapperTest {

    private static final Genshin_role_detailMapper mapper;
    private static final SqlSession sqlSession;

    static {
        try {
            MapperFactory<Genshin_role_detailMapper> factory = new MapperFactory<>(Genshin_role_detailMapper.class);
            sqlSession = factory.getSqlSession();
            mapper = factory.getMapper();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void selectAllTest(){
        List<Genshin_role_detail> genshin_role_details = mapper.selectAll();
        for (Genshin_role_detail role_detail: genshin_role_details) {
            System.out.println(role_detail);
        }

    }

    @Test
    public void selectByIdTest() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        Genshin_role_detailMapper mapper = sqlSession.getMapper(Genshin_role_detailMapper.class);

        Genshin_role_detail role_detail = mapper.selectById("30");
        System.out.println(role_detail);
    }

    @Test
    public void selectById2Test() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        Genshin_role_detailMapper mapper = sqlSession.getMapper(Genshin_role_detailMapper.class);

        Genshin_role_detail role_detail = mapper.selectById2("30");
        System.out.println(role_detail);
    }

    @Test
    public void selectById3Test() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        Genshin_role_detailMapper mapper = sqlSession.getMapper(Genshin_role_detailMapper.class);

        Genshin_role_detail role_detail = mapper.selectById3("30");
        System.err.println(role_detail);
    }
    @Test
    public void selectById4Test() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        Genshin_role_detailMapper mapper = sqlSession.getMapper(Genshin_role_detailMapper.class);

        Genshin_role_detail role_detail = mapper.selectById4("30");
        System.err.println(role_detail);
    }

    @Test
    public void selectById5Test() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        Genshin_role_detailMapper mapper = sqlSession.getMapper(Genshin_role_detailMapper.class);

        Genshin_role_detail role_detail = mapper.selectById4("30");
        System.err.println(role_detail.getId());
    }
}
