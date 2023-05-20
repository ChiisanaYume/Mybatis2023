package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.Genshin_region;
import com.faintdream.mybatis.pojo.Genshin_role_detail;
import com.faintdream.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Test Object
 * @author faintdream
 * @version 1.0
 * */
public class Genshin_role_detailMapperTest {


    public final static SqlSession SQL_SESSION;
    public final static Genshin_role_detailMapper<Genshin_role_detail,String> MAPPER;

    /*查询数据的mapper对象*/
    static {
        try {
            SQL_SESSION = SqlSessionUtil.openSqlSession();
            // 面向接口获取代理对象
            MAPPER = SQL_SESSION.getMapper(Genshin_role_detailMapper.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void selectAllTest(){

        List<Genshin_role_detail> roles = MAPPER.selectAll();
        roles.forEach(role->{System.err.println(role);});

    }

    @Test
    public void selectById(){
        Genshin_role_detail role = MAPPER.selectById("4");
        System.err.println(role);
    }
}
