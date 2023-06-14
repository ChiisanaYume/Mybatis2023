package com.faintdream.mybatis.sot;

import java.util.List;

/**
 * 查询所有
 * @author faintdream
 * @version 1.0
 * @since 1.0
 * */
public interface SelectAllSOT<P> extends SqlOperationTemplate {

    /**
     * 查询所有数据(数据库表中)
     * @return P pojo 对象
     * */
    public List<P> selectAll();
}
