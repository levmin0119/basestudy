package com.zhangyue.study.base;

import com.zhangyue.study.overwrite.Dog;

import java.math.BigDecimal;

public class BankAccount {

    private String owner;

    private double balance;

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
    public BankAccount(String owner,double balance){
        this.owner = owner;
        this.balance = balance;
    }

    /**
     * 存钱
     *
     * @param money
     */
    public void deposit(double money) {
        this.balance = this.balance + money;
        System.out.println("当前用户：" + this.owner + "总余额：" + this.balance);
    }

    public void withdraw(double money) {
        if (money > this.balance) {
            System.out.println("余额不足，不能取款");
        } else {
            System.out.println("可以取款！！");
            this.balance = this.balance - money;
            System.out.println("当前剩余：" + this.balance);
        }
    }
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount("张钺",0);
        bankAccount.withdraw(10);
        bankAccount.deposit(100);
        bankAccount.withdraw(10);
    }
}
