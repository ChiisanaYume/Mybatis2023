package com.faintdream.bank.dao;

import com.faintdream.bank.pojo.Account;

/**
 * 账户类的dao对象，负责数据库的crud
 * @author faintdream
 * @version 1.0
 * @since 1.0
 * */
public interface AccountDao {

    /**
     * 根据账户名(act_no)更新账户信息
     *
     * @param account 账户名
     * @return
     */
    public int updateByAct_no(final Account account);

    /**
     * 根据账户名(act_no)查询账户信息
     * @param id 账户id
     * */
    public Account selectByAct_no(final String id);

}
