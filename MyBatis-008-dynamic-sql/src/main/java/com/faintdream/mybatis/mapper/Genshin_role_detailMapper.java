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
}
