package com.faintdream.mybatis.genshin.data;

import com.faintdream.mybatis.pojo.Genshin_role;
import com.faintdream.mybatis.pojo.Sex;
import org.junit.BeforeClass;
import org.junit.Test;

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
}
