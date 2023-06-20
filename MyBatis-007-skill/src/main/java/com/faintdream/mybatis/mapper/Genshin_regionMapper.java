package com.faintdream.mybatis.mapper;

import java.util.List;

public interface Genshin_regionMapper<R> {

    /**
     * 根据id查询数据
     * @param id 数据id
     * */
    public R selectById(String id);

    /**
     * 查询所有数据
     * */
    public List<R> selectAll();
}
