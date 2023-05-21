package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.sot.SelectAllSOT;
import com.faintdream.mybatis.sot.SelectByIdSOT;

import java.util.List;

/**
 * 数据库的操作方法
 * @author faintdream
 * @version 1.0
 * @since 1.0
 * */
public interface Genshin_role_detailMapper<P,String> extends SelectAllSOT<P>, SelectByIdSOT<P,String> {

    public List<P> select();

    /**
     * 根据id查询数据，如果id为空,则返回所有数据
     * @param id 查询id
     * */
    public List<P> selectD1(java.lang.String id);
}
