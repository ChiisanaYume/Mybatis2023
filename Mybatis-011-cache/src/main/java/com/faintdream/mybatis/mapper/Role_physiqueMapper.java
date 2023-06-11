package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.Role_physique;
import com.faintdream.mybatis.sot.InsertSOT;
import com.faintdream.mybatis.sot.SelectAllSOT;
import com.faintdream.mybatis.sot.SelectByIdSOT;

public interface Role_physiqueMapper extends SelectByIdSOT<Role_physique, String>, SelectAllSOT<Role_physique>,
        InsertSOT<Role_physique> {
}
