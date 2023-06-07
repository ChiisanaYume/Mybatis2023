package com.faintdream.mybatis.util;

import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

/**
 * 构建一个Mapper对象
 *
 * @author faintdream
 * @version 1.0
 */
public class MapperBuilder<M> {

    /**
     * 构建对象的。。。
     */
    private Class<M> mapperClass;
    private SqlSession sqlSession;

    public MapperBuilder(Class<M> mapperClass) {
        this.mapperClass = mapperClass;
        try {
            this.sqlSession = SqlSessionUtil.openSqlSession();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Deprecated
    public MapperBuilder() {

    }

    /**
     * 构建一个Mapper对象
     * @return mapper对象
     */
    public M getMapper() {
        return sqlSession.getMapper(mapperClass);
    }

    public SqlSession getSqlSession(){
        return sqlSession;
    }
}

