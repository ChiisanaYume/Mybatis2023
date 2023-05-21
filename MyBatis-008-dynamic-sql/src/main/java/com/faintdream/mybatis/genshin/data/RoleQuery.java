package com.faintdream.mybatis.genshin.data;

import com.faintdream.mybatis.mapper.*;
import com.faintdream.mybatis.pojo.*;
import com.faintdream.mybatis.util.MapperBuilder;

import java.util.List;
import java.util.Map;

public class RoleQuery {

    /**
     * 数据
     * */
    public static List<Genshin_role> names;
    public static List<Sex> sexs;
    public static List<Elemental_type> elemental_types;
    public static List<Genshin_region> regions;
    public static List<Weapons_type> weapons_types;

    /**
     * 更新数据
     * */
    public void update(){
        names =  new MapperBuilder<Genshin_roleMapper>(Genshin_roleMapper.class).getMapper().selectAll();
        sexs =  new MapperBuilder<SexMapper>(SexMapper.class).getMapper().selectAll();
        elemental_types = new MapperBuilder<Elemental_typeMapper>(Elemental_typeMapper.class).getMapper().selectAll();
        regions = new MapperBuilder<Genshin_regionMapper>(Genshin_regionMapper.class).getMapper().selectAll();
        weapons_types = new MapperBuilder<Weapons_typeMapper>(Weapons_typeMapper.class).getMapper().selectAll();

    }

    public Map<String,String> select(){
        return null;
    }

    public Genshin_role getName(String id){
        for(Genshin_role name:names){
            if(name.getId().equals(id)){
                return name;
            }

        }
        return null;
    }

    public Sex getSex(String no){
        for(Sex sex:sexs){
            if(sex.getNo().equals(no)){
                return sex;
            }

        }
        return null;
    }
}
