package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.genshin.data.RoleQuery;
import com.faintdream.mybatis.pojo.Genshin_region;
import com.faintdream.mybatis.pojo.Genshin_role_detail;
import com.faintdream.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.jetbrains.annotations.NotNull;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Test Object
 * @author faintdream
 * @version 1.0
 * */
public class Genshin_role_detailMapperTest {


    public final static SqlSession SQL_SESSION;
    public final static Genshin_role_detailMapper<Genshin_role_detail,String> MAPPER;

    /*查询数据的mapper对象*/
    static {
        try {
            SQL_SESSION = SqlSessionUtil.openSqlSession();
            // 面向接口获取代理对象
            MAPPER = SQL_SESSION.getMapper(Genshin_role_detailMapper.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void selectAllTest(){

        List<Genshin_role_detail> roles = MAPPER.selectAll();
        roles.forEach(role->{System.err.println(role);});


    }

    @Test
    public void selectByIdTest(){
        Genshin_role_detail role = MAPPER.selectById("4");
        System.err.println(role);

        RoleQuery roleQuery = new RoleQuery();
        roleQuery.update();
        System.out.println(roleQuery.getName(role.getId()).getName_c());
        System.out.println(roleQuery.getSex(role.getSex()).getSex_c());
        System.out.println(roleQuery.getElemental_type(role.getElemental_type()).getType_c());
        System.out.println(roleQuery.getRegion(role.getRegion()).getRegion_c());
        System.out.println(roleQuery.getWeapons_type(role.getWeapons_type()).getWeapons_c());
    }

    @Test
    public void SelectByD1Test(){
        List<Genshin_role_detail> roles = MAPPER.selectD1(null);
        show(roles);
    }

    @Ignore
    public static void show(@NotNull final List<Genshin_role_detail> roles){
        RoleQuery roleQuery = new RoleQuery();
        roleQuery.update();

        roles.forEach(role->{
            System.out.print(roleQuery.getName(role.getId()).getName_c());
            System.out.print(",");
            System.out.print(roleQuery.getSex(role.getSex()).getSex_c());
            System.out.print(",");
            System.out.print(roleQuery.getElemental_type(role.getElemental_type()).getType_c());
            System.out.print(",");
            System.out.print(roleQuery.getRegion(role.getRegion()).getRegion_c());
            System.out.print(",");
            System.out.print(roleQuery.getWeapons_type(role.getWeapons_type()).getWeapons_c());
            System.out.print(",");
            System.out.print(role.getRarity());
            System.out.println();
        });

    }
}
