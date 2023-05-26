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
    public final static Genshin_role_detailMapper MAPPER;

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
        show(roles);

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

        roles = MAPPER.selectD1("8");
        show(roles);
    }

    @Test
    public void SelectByD2Test(){
        List<Genshin_role_detail> roles = MAPPER.selectD2(null,null,null);
        show(roles);
        System.out.println("↑↑说有角色↑↑");

        roles = MAPPER.selectD2("1",null,null);
        show(roles);
        System.out.println("↑↑男角色↑↑");

        roles = MAPPER.selectD2("2",null,null);
        show(roles);
        System.out.println("↑↑女角色↑↑");

        roles = MAPPER.selectD2("","6",null);
        show(roles);
        System.out.println("↑↑火属性↑↑");

        roles = MAPPER.selectD2("2","6",null);
        show(roles);
        System.out.println("↑↑火属性女角色↑↑");

        roles = MAPPER.selectD2("2","6","5");
        show(roles);
        System.out.println("↑↑火属性女长枪角色↑↑");
    }

    @Test
    public void selectD3Test(){
        List<Genshin_role_detail> roles = MAPPER.selectD3(null,null,null);
        show(roles);
        System.out.println("↑↑没有任何条件,查女角色↑↑");

        roles = MAPPER.selectD3(null,null,"1");
        show(roles);
        System.out.println("↑↑不查女角色了，我查男的↑↑");

        roles = MAPPER.selectD3(null,"1","1");
        show(roles);
        System.out.println("↑↑查单手剑的，查不到我就查女的↑↑");

        roles = MAPPER.selectD3("7","1","1");
        show(roles);
        System.out.println("↑↑查冰系的,查不到我就查单手剑的，再查不到我就查女的↑↑");
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
