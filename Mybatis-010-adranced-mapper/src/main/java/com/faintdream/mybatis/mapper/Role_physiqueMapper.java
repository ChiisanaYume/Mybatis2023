package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.Role_physique;
import com.faintdream.mybatis.sot.SelectAllSOT;
import com.faintdream.mybatis.sot.SelectByIdSOT;

import java.util.List;

public interface Role_physiqueMapper extends SelectByIdSOT<Role_physique,String>, SelectAllSOT<Role_physique> {
    Role_physique selectByIdCollection(String no);
    Role_physique selectByIdStep(String no);
}

