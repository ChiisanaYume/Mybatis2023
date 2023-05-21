package com.faintdream.mybatis.genshin.data;

import com.faintdream.mybatis.pojo.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RoleQueryTest {

    private static RoleQuery roleQuery = null;

    @BeforeClass
    public static void setDate(){
        roleQuery = new RoleQuery();
        roleQuery.update();
    }

    @Test
    public void getNameTest(){
        Genshin_role name1 = roleQuery.getName("4");
        System.err.println(name1.getName_c());

        Genshin_role name2 = roleQuery.getName("5");
        System.err.println(name2.getName_c());
    }

    @Test
    public void getSexTest(){
        Sex sex1 = roleQuery.getSex("3");
        Sex sex2 = roleQuery.getSex("1");
        Sex sex3 = roleQuery.getSex("2");

        System.err.println(sex1.getSex());
        System.err.println(sex2.getSex());
        System.err.println(sex3.getSex());
        roleQuery.update();
    }

    @Test
    public void getElemental_typeTest(){
        Elemental_type type1 = roleQuery.getElemental_type("1");
        Elemental_type type2 = roleQuery.getElemental_type("2");
        Elemental_type type3 = roleQuery.getElemental_type("3");

        Assert.assertEquals("风",type1.getType_c());
        Assert.assertEquals("岩",type2.getType_c());
        Assert.assertEquals("雷",type3.getType_c());

        System.err.println(type1.getType_c());
        System.err.println(type2.getType_c());
        System.err.println(type3.getType_c());

    }

    @Test
    public void getRegionTest(){
        // Genshin_region[] regions = new Genshin_region[];
        List<Genshin_region> regions = new ArrayList<Genshin_region>();

        for(Genshin_region region:RoleQuery.regions){
            regions.add(roleQuery.getRegion(region.getNo()));
        }

        Assert.assertEquals("蒙德",regions.get(0).getRegion_c());
        Assert.assertEquals("璃月",regions.get(1).getRegion_c());
        Assert.assertEquals("稻妻",regions.get(2).getRegion_c());
        Assert.assertEquals("须弥",regions.get(3).getRegion_c());
        Assert.assertEquals("枫丹",regions.get(4).getRegion_c());
        Assert.assertEquals("纳塔",regions.get(5).getRegion_c());
        Assert.assertEquals("至冬",regions.get(6).getRegion_c());

        /*遍历*/
        for(Genshin_region region:regions){
            System.err.println(region.getRegion_c());
        }
    }

    @Test
    public void getWeapons_typeTest(){

        Weapons_type type0 = roleQuery.getWeapons_type("0");
        Weapons_type type1 = roleQuery.getWeapons_type("1");
        Weapons_type type2 = roleQuery.getWeapons_type("2");
        Weapons_type type3 = roleQuery.getWeapons_type("3");

        Assert.assertEquals("其他武器",type0.getWeapons_c());
        Assert.assertEquals("单手剑",type1.getWeapons_c());
        Assert.assertEquals("双手剑",type2.getWeapons_c());
        Assert.assertEquals("弓",type3.getWeapons_c());

        System.err.println(type0.getWeapons_c());
        System.err.println(type1.getWeapons_c());
        System.err.println(type2.getWeapons_c());
        System.err.println(type3.getWeapons_c());
    }
}
