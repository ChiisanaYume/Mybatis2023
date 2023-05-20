package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.Elemental_type;
import com.faintdream.mybatis.pojo.Genshin_region;
import com.faintdream.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Elemental_typeMapperTest {

    public static final  SqlSession SQL_SESSION;
    public static final Elemental_typeMapper<Elemental_type> MAPPER;

    /*查询数据的mapper对象*/
    static {
        try {
            SQL_SESSION = SqlSessionUtil.openSqlSession();
            // 面向接口获取代理对象
            MAPPER = SQL_SESSION.getMapper(Elemental_typeMapper.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void selectAllTest(){

        List<Elemental_type> list = MAPPER.selectAll();
        list.forEach(type->{System.err.println(type.getType_c());});
    }
}
