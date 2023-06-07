package com.faintdream.mybaties.mapper;

import com.faintdream.mybatis.mapper.Role_physiqueMapper;
import com.faintdream.mybatis.pojo.Role_physique;
import com.faintdream.mybatis.util.MapperFactory;
import com.faintdream.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Role_physiqueMapperTest {

    private static SqlSession SQL_SESSION;
    private static Role_physiqueMapper MAPPER;

    /*查询数据的mapper对象*/
    static {
        try {
            SQL_SESSION = SqlSessionUtil.openSqlSession();
            // 面向接口获取代理对象
            MAPPER = SQL_SESSION.getMapper(Role_physiqueMapper.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    @Test
    public void selectTest() throws IOException {

        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        Role_physiqueMapper role_physiqueMapper = sqlSession.getMapper(Role_physiqueMapper.class);

        List<Role_physique> role_physiques = role_physiqueMapper.selectAll();

        System.err.println(role_physiques);
    }

    @Test
    public void selectTest2(){

        List<Role_physique> role_physiques = MAPPER.selectAll();

        System.err.println(role_physiques);
    }


    @Test
    public void selectTest4(){
        Role_physique rolePhysique = MAPPER.selectById("1");

        System.err.println(rolePhysique);
    }

    @Ignore
    @Test
    public void insertTest(){
        int count = MAPPER.insert(new Role_physique("8", "Old woman", "老太太"));
        System.err.println(count);
        SQL_SESSION.commit();
        SQL_SESSION.close();
    }

    @Ignore
    @Test
    public void insertTest2(){
        int count = MAPPER.insert2(new Role_physique("8", "Old woman", "老太太"));
        System.err.println(count);

    }

    @Test
    public void selectTest5() throws ClassNotFoundException {
        MapperFactory<Role_physiqueMapper> mapperFactory = new MapperFactory<Role_physiqueMapper>(Role_physiqueMapper.class);

        Role_physique rolePhysique = mapperFactory.getMapper().selectById("1");

        System.err.println(rolePhysique);
        System.err.println(mapperFactory.getSqlSession());
    }

    @Test
    public void selectTest6() throws IOException, ClassNotFoundException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        System.err.println(sqlSession);//org.apache.ibatis.session.defaults.DefaultSqlSession@3f9342d4

        MapperFactory<Role_physiqueMapper> mapperFactory = new MapperFactory<Role_physiqueMapper>
                (sqlSession,Role_physiqueMapper.class);

        Role_physique rolePhysique = mapperFactory.getMapper().selectById("1");

        System.err.println(rolePhysique);
        System.err.println(mapperFactory.getSqlSession());//org.apache.ibatis.session.defaults.DefaultSqlSession@3f9342d4
    }
}
