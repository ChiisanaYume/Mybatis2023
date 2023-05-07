package com.faintdram.bank.dao.impl;

import com.faintdream.bank.dao.impl.AccountDaoImpl;
import com.faintdream.bank.pojo.Account;
import org.junit.Test;

public class AccountDaoImplTest {

    AccountDaoImpl accountDaoImpl = new AccountDaoImpl();
    @Test
    public void selectByAct_noTest(){
        Account account = accountDaoImpl.selectByAct_no("ACT001");
        System.out.println(account);
    }

    @Test
    public void updateByAct_noTest(){
        accountDaoImpl.updateByAct_no(new Account(null,"ACT003","100000000"));
    }
}
