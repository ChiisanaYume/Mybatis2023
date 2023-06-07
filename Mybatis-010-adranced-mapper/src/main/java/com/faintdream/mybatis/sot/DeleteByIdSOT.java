package com.faintdream.mybatis.sot;

/**
 * 删除一条数据
 * @author faintdream
 * @version 1.0
 * @since 1.0
 * */
public interface DeleteByIdSOT extends SqlOperationTemplate{

    /**
     * 删除一条数据
     * @param id 要删除的数据id(主键)
     * @return int 删除完成后受影响的数据条数(1表示删除成功)
     * */

    int deleteById(String id);
}
