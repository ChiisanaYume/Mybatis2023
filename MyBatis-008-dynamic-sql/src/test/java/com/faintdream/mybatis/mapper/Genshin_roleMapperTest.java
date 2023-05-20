package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.Genshin_role;
import com.faintdream.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Genshin_roleMapperTest {

    public final static SqlSession SQL_SESSION;
    public final static Genshin_roleMapper<Genshin_role> MAPPER;

    /*查询数据的mapper对象*/
    static {
        try {
            SQL_SESSION = SqlSessionUtil.openSqlSession();
            // 面向接口获取代理对象
            MAPPER = SQL_SESSION.getMapper(Genshin_roleMapper.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void selectAll(){
        List<Genshin_role> roles = MAPPER.selectAll();
        roles.forEach(role ->{
            System.err.print(role.getId() + ",");
            System.err.print(role.getName()+ ",");
            System.err.println(role.getName_c());
        });
    }
}
