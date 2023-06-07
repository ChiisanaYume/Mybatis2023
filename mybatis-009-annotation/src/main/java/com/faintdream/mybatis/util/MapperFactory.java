package com.faintdream.mybatis.util;

import com.faintdream.mybatis.mapper.Role_physiqueMapper;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

/**
 * 工厂模式构建一个Mapper对象
 *
 * @author faintdream
 * @version 1.0
 */
public class MapperFactory<M> {

    private Class<M> mapperClass;
    private SqlSession sqlSession;
    private M mapper;

    @Deprecated
    public MapperFactory() {

    }

    public MapperFactory(Class<M> mapperClass)throws ClassNotFoundException{
        this.mapperClass = mapperClass;
        build();
    }

    public MapperFactory(SqlSession sqlSession) throws ClassNotFoundException {
        this.sqlSession = sqlSession;
        build();
    }

    public MapperFactory(SqlSession sqlSession,Class<M> mapperClass) throws ClassNotFoundException {
        this.sqlSession = sqlSession;
        this.mapperClass = mapperClass;
        build();
    }

    private void build() throws ClassNotFoundException {
        if(sqlSession==null){
            try {
                sqlSession = SqlSessionUtil.openSqlSession();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if(mapperClass==null){
            throw new ClassNotFoundException("mapperClass不存在");
        }

        mapper = sqlSession.getMapper(mapperClass);
    }

    /**
     * 构建一个Mapper对象
     * @return mapper对象
     */
    public M getMapper() {
        return mapper;
    }

    public SqlSession getSqlSession(){
        return sqlSession;
    }

    public void setMapperClass(Class<M> mapperClass) throws ClassNotFoundException {
        this.mapperClass = mapperClass;
        build();
    }

    public void setSqlSession(SqlSession sqlSession) throws ClassNotFoundException {
        this.sqlSession = sqlSession;
        build();
    }

}

