package com.faintdream.mybatis;

import com.faintdream.mybatis.mapper.*;
import com.faintdream.mybatis.pojo.*;
import org.junit.Test;

import javax.lang.model.element.Element;
import java.util.List;

/**
 * 不符合java规范
 * 仅仅做测试
 * */
public class GenshinTest {

    private Genshin_roleMapperTest grmt = new Genshin_roleMapperTest();
    private SexMapperTest smt = new SexMapperTest();
    private Elemental_typeMapperTest etmt = new Elemental_typeMapperTest();
    private Genshin_regionMapperTest gremt = new Genshin_regionMapperTest();
    private Weapons_type_MapperTest wtmt = new Weapons_type_MapperTest();

    @Test
    public void selectTest(){
        List<Genshin_role> roles = Genshin_roleMapperTest.MAPPER.selectAll();
        List<Sex> sexs = SexMapperTest.MAPPER.selectAll();
        List<Elemental_type> elemental_types= Elemental_typeMapperTest.MAPPER.selectAll();
        List<Genshin_region> regions = Genshin_regionMapperTest.MAPPER.selectAll();
        List<Weapons_type> weapons_types = Weapons_type_MapperTest.MAPPER.selectAll();
        System.err.println(roles);

        //
        List<Genshin_role_detail> r = Genshin_role_detailMapperTest.MAPPER.selectAll();

        System.err.println(r);

        // 查询编号为4的角色
        for(Genshin_role role : roles){
            if("4".equals(role.getId())){
                System.err.println(role.getName_c());
            }
        }
    }
}
