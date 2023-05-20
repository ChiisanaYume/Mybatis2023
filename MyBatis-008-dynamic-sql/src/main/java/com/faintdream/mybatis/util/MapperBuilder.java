package com.faintdream.mybatis.util;

import com.faintdream.mybatis.mapper.Elemental_typeMapper;
import com.faintdream.mybatis.mapper.SexMapper;
import com.faintdream.mybatis.pojo.Elemental_type;
import com.faintdream.mybatis.pojo.Sex;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class MapperBuilder<M>{
    public Class<M> mapperClass;

    /*查询数据的mapper对象*/
    public MapperBuilder(Class<M> mapperClass){
        this.mapperClass = mapperClass;
    }

    @Deprecated
    public MapperBuilder(){

    }

    public M getMapper(){
        try {
            SqlSession sqlSession = SqlSessionUtil.openSqlSession();
            return sqlSession.getMapper(mapperClass);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

