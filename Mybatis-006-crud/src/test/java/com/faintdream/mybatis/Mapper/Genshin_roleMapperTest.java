package com.faintdream.mybatis.Mapper;

import com.faintdream.mybatis.mapper.Genshin_roleMapper;
import com.faintdream.mybatis.pojo.Genshin_role;
import com.faintdream.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public class Genshin_roleMapperTest {

    private final static SqlSession SQL_SESSION;
    private static final Genshin_roleMapper<Genshin_role> MAPPER;
    /*查询数据的mapper对象*/
    static{
        try {
            SQL_SESSION = SqlSessionUtil.openSqlSession();
             // 面向接口获取代理对象
             MAPPER = SQL_SESSION.getMapper(Genshin_roleMapper.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Ignore
    @Test
    public void insertTest(){
        Genshin_role role = new Genshin_role(null,"Annie","安妮");
        MAPPER.insert(role);
        SQL_SESSION.commit();
    }

    @Ignore
    @Test
    public void deleteTest(){
        MAPPER.deleteById("84");
        SQL_SESSION.commit();
    }
    @Ignore
    @Test
    public void updateTest(){
        Genshin_role role = new Genshin_role("84","Heme","公主");
        MAPPER.update(role);
        SQL_SESSION.commit();
    }
    @Ignore
    @Test
    public void updateByIdTest(){
        Genshin_role role = new Genshin_role("85","Hhhh","公主");
        MAPPER.updateById(role,"85");
        //SQL_SESSION.commit();
    }

    @Test
    public void selectByIdTest(){

        Genshin_role role = MAPPER.selectById("4");
        System.err.println(role);
        role = MAPPER.selectById("5");
        System.err.println(role);
    }
    @Test
    public void selectAllTest(){

        List<Genshin_role> roles = MAPPER.selectAll();

        // 输出查询结构
        for(Genshin_role role : roles){
            System.err.println(role);
        }
    }


}
