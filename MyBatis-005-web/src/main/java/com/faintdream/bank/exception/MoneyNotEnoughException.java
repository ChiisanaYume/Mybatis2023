package com.faintdream.bank.exception;

/**
 * 账户余额不足异常
 * */
public class MoneyNotEnoughException extends Exception{

    public MoneyNotEnoughException() {
    }

    public MoneyNotEnoughException(String message) {
        super(message);
    }
}
