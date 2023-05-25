package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.Genshin_role_detail;
import com.faintdream.mybatis.sot.SelectAllSOT;
import com.faintdream.mybatis.sot.SelectByIdSOT;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 数据库的操作方法
 * @author faintdream
 * @version 1.0
 * @since 1.0
 * */
interface Genshin_role_detailMapper extends SelectAllSOT<Genshin_role_detail>, SelectByIdSOT<Genshin_role_detail,String> {

    List<Genshin_role_detail> select();

    /**
     *
     * 根据id查询数据，如果id为空,则返回所有数据
     * @param id 查询id
     * */
    List<Genshin_role_detail> selectD1(String id);

    /**
     * 查询数据
     *
     * @param sex 性别编号
     * @param elemental_type 神之眼类型编号
     * @param weapons_type 武器类型编号
     * @return 查询结果
     */
    List<Genshin_role_detail> selectD2(@Param("sex")String sex, @Param("elemental_type")String elemental_type, @Param("weapons_type")String weapons_type);

    /**
     * 查询数据
     *
     * @param elemental_type 神之眼类型编号
     * @param weapons_type 武器类型编号
     * @param sex 性别
     * @return
     */
    List<Genshin_role_detail> selectD3(@Param("elemental_type")String elemental_type, @Param("weapons_type")String weapons_type, @Param("sex")String sex);
}
