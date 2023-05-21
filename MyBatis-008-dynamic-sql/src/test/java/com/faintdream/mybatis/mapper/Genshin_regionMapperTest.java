package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.Genshin_region;
import com.faintdream.mybatis.util.MapperBuilder;
import com.faintdream.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Genshin_regionMapperTest {

    public final static Genshin_regionMapper<Genshin_region> MAPPER
            = new MapperBuilder<Genshin_regionMapper>(Genshin_regionMapper.class).getMapper();



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
