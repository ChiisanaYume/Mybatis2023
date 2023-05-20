package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.Genshin_region;
import com.faintdream.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Genshin_regionMapperTest {

    public final static SqlSession SQL_SESSION;
    public final static Genshin_regionMapper<Genshin_region> MAPPER;

    /*查询数据的mapper对象*/
    static {
        try {
            SQL_SESSION = SqlSessionUtil.openSqlSession();
            // 面向接口获取代理对象
            MAPPER = SQL_SESSION.getMapper(Genshin_regionMapper.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void selectAllTest() {
        List<Genshin_region> regions = MAPPER.selectAll();
        regions.forEach(region -> System.err.println(region));
    }

    @Test
    public void selectByIdTest(){
        Genshin_region region = MAPPER.selectById("2");
        System.err.println(region.getRegion_c());

        region = MAPPER.selectById("5");
        System.err.println(region.getRegion_c());

        region = MAPPER.selectById("7");
        System.err.println(region.getRegion_c());
    }
}
