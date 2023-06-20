package com.faintdream.mybatis.mapper;

import com.faintdream.mybatis.pojo.Role_physique;
import com.faintdream.mybatis.sot.InsertSOT;
import com.faintdream.mybatis.sot.SelectAllSOT;
import com.faintdream.mybatis.sot.SelectByIdSOT;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Role_physiqueMapper extends InsertSOT<Role_physique>, SelectAllSOT<Role_physique>, SelectByIdSOT<Role_physique,String> {

    @Override
    @Select("SELECT * FROM t_role_physique")
    List<Role_physique> selectAll();

    @Override
    @Select("SELECT * FROM t_role_physique WHERE no=#{id}")
    Role_physique selectById(String id);


    @Override
    @Insert("INSERT INTO t_role_physique (no,physique,physique_c) VALUE(#{no},#{physique},#{physique_c})")
    int insert(Role_physique pojo);


    // 这种语法是不对的
    @Insert("INSERT INTO t_role_physique (no,physique,physique_c) VALUE(#{no},#{physique},#{physique_c});" +
            "COMMIT;")
    int insert2(Role_physique pojo);
}
