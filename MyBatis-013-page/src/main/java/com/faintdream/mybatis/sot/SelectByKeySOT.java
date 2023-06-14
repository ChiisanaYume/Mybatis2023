package com.faintdream.mybatis.sot;

/**
 * 查询(根据key[键，一般为主键])
 * @author faintdream
 * @version 1.0
 * @since 1.0
 * */
public interface SelectByKeySOT<P,KEY> extends SqlOperationTemplate {
    /**
     * 查询(根据key[键，一般为主键])
     * @param key 查询(主)键
     * @return pojo 对象
     * */
    P selectByKey(KEY key);
}
