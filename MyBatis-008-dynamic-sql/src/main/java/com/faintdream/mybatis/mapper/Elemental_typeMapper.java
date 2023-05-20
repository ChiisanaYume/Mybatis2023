package com.faintdream.mybatis.mapper;

import java.util.List;

/**
 * 数据库的操作方法
 * @author faintdream
 * @version 1.0
 * @since 1.0
 * */
public interface Elemental_typeMapper<P> {
    /**
     * 查询所有数据
     * @return 查询结果
     * */
    public List<P> selectAll();
}
