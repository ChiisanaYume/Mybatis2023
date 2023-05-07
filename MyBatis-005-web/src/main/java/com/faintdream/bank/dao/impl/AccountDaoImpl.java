package com.faintdream.bank.dao.impl;

import com.faintdream.bank.dao.AccountDao;
import com.faintdream.bank.pojo.Account;
import com.faintdream.bank.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class AccountDaoImpl implements AccountDao {

    @Override
    public int updateByAct_no(final Account account) {

        // 数据库连接对象
        SqlSession sqlSession = null;

        //执行更新
        try {
            sqlSession = SqlSessionUtil.openSqlSession();


            int count = sqlSession.update("com.faintdream.act.updateByAct_no", account);
            if (count == 1) {
                sqlSession.commit();
                return count;
            }

        } catch (Exception e) {
            if (sqlSession != null) {
                sqlSession.rollback();
            }
            e.printStackTrace();
        }

        return 0;
    }


    @Override
    public Account selectByAct_no(final String act_no) {

        // 数据库连接对象
        SqlSession sqlSession = null;

        // 执行查询
        try {
            sqlSession = SqlSessionUtil.openSqlSession();
            return sqlSession.selectOne("com.faintdream.act.selectById", act_no);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
