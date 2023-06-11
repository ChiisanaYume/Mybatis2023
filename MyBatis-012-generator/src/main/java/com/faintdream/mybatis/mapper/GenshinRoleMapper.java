package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.GenshinRole;
import java.util.List;

public interface GenshinRoleMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(GenshinRole row);
    GenshinRole selectByPrimaryKey(Integer id);
    List<GenshinRole> selectAll();
    int updateByPrimaryKey(GenshinRole row);
}