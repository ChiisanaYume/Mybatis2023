package com.faintdream.bank.pojo;

/**
 * POJO 实体类(银行账户)
 *
 * @author faintdream
 * @version 1.0
 * @since 1.0
 */
public class Account {
    private String id;
    private String act_no;
    private String balance;

    public Account(String id, String act_no, String balance) {
        this.id = id;
        this.act_no = act_no;
        this.balance = balance;
    }

    public Account() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAct_no() {
        return act_no;
    }

    public void setAct_no(String act_no) {
        this.act_no = act_no;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", act_no='" + act_no + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
