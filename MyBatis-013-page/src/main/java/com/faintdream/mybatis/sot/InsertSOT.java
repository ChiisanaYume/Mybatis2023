package com.faintdream.mybatis.sot;

/**
 * 插入一条数据
 * @author faintdream
 * @version 1.0
 * @since 1.0
 * */
public interface InsertSOT<P> extends SqlOperationTemplate {

    /**
     * 插入一条数据(插入到数据库表中)
     * @param pojo 要插入的数据
     * @return int 插入完成后受影响的数据条数(1表示插入成功)
     * */
    int insert(P pojo);
}
