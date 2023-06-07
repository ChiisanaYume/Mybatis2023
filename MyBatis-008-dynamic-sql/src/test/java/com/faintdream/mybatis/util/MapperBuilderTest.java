package com.faintdream.mybatis.util;

import com.faintdream.mybatis.mapper.SexMapper;
import com.faintdream.mybatis.mapper.Weapons_typeMapper;
import com.faintdream.mybatis.pojo.Sex;
import com.faintdream.mybatis.pojo.Weapons_type;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * 能跑就行
 * */
public class MapperBuilderTest {
    @Test
    public void getMapperTest(){
        MapperBuilder<Weapons_typeMapper> m = new MapperBuilder<>(Weapons_typeMapper.class);
        Weapons_typeMapper mapper = m.getMapper();

        System.err.println(mapper);
        List<Weapons_type> list1 = mapper.selectAll();
        for(Weapons_type w:list1){
            System.err.println(w);
        }

        MapperBuilder<SexMapper> m2 = new MapperBuilder<>(SexMapper.class);
        SexMapper mapper2 = m2.getMapper();
        List<Sex> list2 = mapper2.selectAll();
        for(Sex s:list2){
            System.err.println(s);
        }

    }

    @Ignore
    @Test
    public void classTest() throws ClassNotFoundException {
        String s = "Hhh";
        getClass(s);
        Class<String> stringClass = String.class;
        Class<?> stringClass2 = Class.forName(s);
    }

    @Contract("_ -> param1")
    private <C> @NotNull C getClass(C c){
        System.out.println(c.getClass());
        return c;
    }
}
