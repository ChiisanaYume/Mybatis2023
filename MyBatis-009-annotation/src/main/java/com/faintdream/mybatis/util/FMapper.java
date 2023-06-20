package com.faintdream.mybatis.util;

import org.apache.ibatis.session.SqlSession;

public class FMapper<M> {

    private Class<M> mapperClass;
    private SqlSession sqlSession;

    public Class<M> getMapperClass() {
        return mapperClass;
    }

    public SqlSession getSqlSession() {
        return sqlSession;
    }

}
