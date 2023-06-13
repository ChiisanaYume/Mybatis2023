package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.Genshin_role_detail;
import com.faintdream.mybatis.sot.SelectAllSOT;
import com.faintdream.mybatis.sot.SelectByIdSOT;

import java.util.List;

public interface Genshin_role_detailMapper extends SelectByIdSOT<Genshin_role_detail,String>, SelectAllSOT<Genshin_role_detail> {

    Genshin_role_detail selectById2(String id);
    Genshin_role_detail selectById3(String id);

    Genshin_role_detail selectById4(String id);

    List<Genshin_role_detail> selectByPhysique(String no);
}
