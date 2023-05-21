package com.faintdream.mybatis.util;

import org.apache.ibatis.session.SqlSession;
import java.io.IOException;

/**
 * 构建一个Mapper对象
 * @author faintdream
 * @version 1.0
 * */
public class MapperBuilder<M>{

    /**
     * 构建对象的。。。
     * */
    private Class<M> mapperClass;


    public MapperBuilder(Class<M> mapperClass){
        this.mapperClass = mapperClass;
    }

    @Deprecated
    public MapperBuilder(){

    }

    /**
     * 构建一个Mapper对象
     * @return mapper对象
     * */
    public M getMapper(){
        try {
            SqlSession sqlSession = SqlSessionUtil.openSqlSession();
            return sqlSession.getMapper(mapperClass);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

