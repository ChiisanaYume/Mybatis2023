package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.Genshin_role_detail;
import com.faintdream.mybatis.pojo.Sex;
import com.faintdream.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class SexMapperTest {

    public final static SqlSession SQL_SESSION;
    public final static SexMapper<Sex> MAPPER;

    /*查询数据的mapper对象*/
    static {
        try {
            SQL_SESSION = SqlSessionUtil.openSqlSession();
            // 面向接口获取代理对象
            MAPPER = SQL_SESSION.getMapper(SexMapper.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void selectAll(){
        List<Sex> list = MAPPER.selectAll();
        for(Sex sex:list){
            System.err.println(sex.getSex_c());
        }
    }
}
