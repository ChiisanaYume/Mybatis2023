package com.faintdream.bank.service.impl;

import com.faintdream.bank.dao.AccountDao;
import com.faintdream.bank.dao.impl.AccountDaoImpl;
import com.faintdream.bank.exception.MoneyNotEnoughException;
import com.faintdream.bank.exception.TransferException;
import com.faintdream.bank.pojo.Account;
import com.faintdream.bank.service.AccountService;
import com.faintdream.bank.util.Calc;

public class AccountServiceImpl implements AccountService {

    public AccountServiceImpl() {

    }

    AccountDao accountDao = new AccountDaoImpl();

    @Override
    public void transfer(final String from_no, final String to_no, final String money) throws MoneyNotEnoughException, TransferException {

        // 判断转出账户的余额是否充足
        Account fromAct = accountDao.selectByAct_no(from_no);
        Double m = new Double(money); //要转出的金额
        Double f = new Double(fromAct.getBalance());// 数据库中余额
        if (f < m) {
            // 余额不足，抛出异常
            throw new MoneyNotEnoughException("对不起，余额不足");
        }

        // 余额充足，执行转账
        Account toAct = accountDao.selectByAct_no(to_no);

        // 计算转入账户金额并提交数据库
        fromAct.setBalance(Calc.sub1(fromAct.getBalance(), money));

        // 计算转出账户金额并提交数据库
        toAct.setBalance(Calc.sum1(toAct.getBalance(), money));

        int count = accountDao.updateByAct_no(fromAct);
        count += accountDao.updateByAct_no(toAct);

        // 如果数据库没有两条记录更新证明转账失败
        if (count != 2) {
            throw new TransferException("转账异常，未知原因");
        }

    }
}
