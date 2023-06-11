package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.GenshinRole;
import com.faintdream.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class GenshinRoleMapperTest {

    @Test
    public void SelectAllTest() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        GenshinRoleMapper mapper = sqlSession.getMapper(GenshinRoleMapper.class);

        List<GenshinRole> roles = mapper.selectAll();
        System.err.println(roles);

        SqlSessionUtil.close(sqlSession);


    }
}
