package com.faintdream.bank.service;

import com.faintdream.bank.exception.MoneyNotEnoughException;
import com.faintdream.bank.exception.TransferException;

/**
 * 银行账户业务接口
 * @author faintdream
 * @version 1.0
 * @since 1.0
 * */
public interface AccountService {

    /**
     * 账户转账业务
     * @param from_no 转入账户
     * @param to_no 转出账户
     * @param money 转出金额
     * */
    public void transfer(final String from_no, final String to_no,final String money) throws MoneyNotEnoughException, TransferException;
}
