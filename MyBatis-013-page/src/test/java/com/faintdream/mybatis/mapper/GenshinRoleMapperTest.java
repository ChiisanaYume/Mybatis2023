package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.GenshinRole;
import com.faintdream.mybatis.util.Calc;
import com.faintdream.mybatis.util.SqlSessionUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.jetbrains.annotations.NotNull;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class GenshinRoleMapperTest {

    @Ignore
    public void show(@NotNull List<GenshinRole> list){
        for(GenshinRole role:list){
            System.err.println(role);
        }
    }

    @Ignore
    public void show( @NotNull GenshinRole @NotNull ... roles){
        List<GenshinRole> list = new LinkedList<>();
        for(GenshinRole role:roles){
            list.add(role);
        }
        show(list);
    }

    @Test
    public void SelectAllTest2() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        GenshinRoleMapper mapper = sqlSession.getMapper(GenshinRoleMapper.class);

        // 在执行SQL语句之前：开启分页功能
        int pageNum = 3;
        int pageSize = 8;
        PageHelper.startPage(pageNum,pageSize);

        List<GenshinRole> list = mapper.selectAll();
        show(list);

        // PageHelper 封装信息对象 PageInfo
        // PageInfo 对象是PageHelper插件提供的，用来封装分页相关的信息的对象
        PageInfo<GenshinRole> pageInfo = new PageInfo<>(list,3);
        System.err.println(pageInfo);

        SqlSessionUtil.close(sqlSession);
    }


    @Test
    public void SelectAllTest() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        GenshinRoleMapper mapper = sqlSession.getMapper(GenshinRoleMapper.class);

        List<GenshinRole> list = mapper.selectAll();
        show(list);

        SqlSessionUtil.close(sqlSession);
    }


    @Test
    public void SelectByKeyTest() throws IOException{
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        GenshinRoleMapper mapper = sqlSession.getMapper(GenshinRoleMapper.class);

        GenshinRole role1 = mapper.selectByKey("72");
        GenshinRole role2 = mapper.selectByKey("73");
        show(role1,role2);
        SqlSessionUtil.close(sqlSession);
    }

    /**
     * SQL注入风险
     * */
    @Test
    public void SelectAllPageTest() throws IOException{
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        GenshinRoleMapper mapper = sqlSession.getMapper(GenshinRoleMapper.class);

        String StartPage = "2";
        String pageSize ="5";
        String StartIndex = Calc.sub2(Calc.mul1(StartPage,pageSize),"1");

        List<GenshinRole> list = mapper.selectAllPage(StartIndex,pageSize);
        show(list);

        SqlSessionUtil.close(sqlSession);
    }

    @Test
    public void SelectAllPage1Test() throws IOException{
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        GenshinRoleMapper mapper = sqlSession.getMapper(GenshinRoleMapper.class);

        int StartPage = 2;
        int pageSize = 5;
        int StartIndex = StartPage * pageSize - 1;

        List<GenshinRole> list = mapper.selectAllPage1(StartIndex,pageSize);
        show(list);

        SqlSessionUtil.close(sqlSession);
    }

    @Deprecated
    @Ignore
    @Test
    public void SelectAllPage2Test() throws IOException{
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        GenshinRoleMapper mapper = sqlSession.getMapper(GenshinRoleMapper.class);

        List<GenshinRole> list = mapper.selectAllPage2(5,8);
        show(list);

        SqlSessionUtil.close(sqlSession);
    }
}
