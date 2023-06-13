package com.faintdream.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 数据库的操作方法
 *
 * @author faintdream
 * @version 1.0
 * @since 1.0
 */
public interface Genshin_roleMapper<R> {

    /**
     * 插入一条数据
     *
     * @param role 数据
     */
    public void insert(R role);

    /**
     * 删除一条数据
     *
     * @param id 数据id
     */
    public void deleteById(String id);

    /**
     * 更新一条数据
     *
     * @param role
     */
    public void update(R role);

    /**
     * 更新一条数据
     *
     * @param name 名字(英文)
     * @param name_c 名字(中文)
     * @param id   数据id
     */
    public void updateById(@Param("name") String name, @Param("name_c") String name_c, @Param("id") String id);

    /**
     * 根据id查询数据
     *
     * @param id 数据id
     */
    public R selectById(String id);

    /**
     * 根据所有数据
     */
    public List<R> selectAll();
}
