package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.Weapons_type;
import com.faintdream.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Weapons_type_MapperTest {

    public final static SqlSession SQL_SESSION;
    public final static Weapons_typeMapper<Weapons_type> MAPPER;

    /*查询数据的mapper对象*/
    static {
        try {
            SQL_SESSION = SqlSessionUtil.openSqlSession();
            // 面向接口获取代理对象
            MAPPER = SQL_SESSION.getMapper(Weapons_typeMapper.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void selectAll(){
        List<Weapons_type> list = MAPPER.selectAll();
        for(Weapons_type type:list){
            System.err.println(type);
            System.err.println(type.getWeapons_c());
        }
    }
}
