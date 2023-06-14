package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.GenshinRole;
import com.faintdream.mybatis.sot.SimpleSelectSOT;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GenshinRoleMapper extends SimpleSelectSOT<GenshinRole,String> {



    /**
     * 分页查询
     * @param startIndex 从第几行开始查
     * @param pageSize 每次查询多少条记录
     * @return 查询的结果
     * */
    List<GenshinRole> selectAllPage(@Param("startIndex")String startIndex, @Param("pageSize") String pageSize);

    /**
     * 分页查询
     * @param startIndex 从第几行开始查
     * @param pageSize 每次查询多少条记录
     * @return 查询的结果
     * */
    List<GenshinRole> selectAllPage1(@Param("startIndex")int startIndex, @Param("pageSize")int pageSize);

    /**
     * 分页查询
     * @param startPage 从第几页开始查
     * @param pageSize 每页多少条记录
     * @return 查询的结果
     * */
    @Deprecated
    List<GenshinRole> selectAllPage2(@Param("startPage") int startPage, @Param("pageSize") int pageSize);

}
