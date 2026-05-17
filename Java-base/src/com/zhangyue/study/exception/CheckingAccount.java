package com.zhangyue.study.exception;

import com.zhangyue.study.base.Book;

import java.math.BigDecimal;

public class CheckingAccount {

    private double balance;

    private int number;

    public CheckingAccount(int number){
        this.number = number;
    }
    //存钱
    public void deposit(double amount){
        balance += amount;
    }
    //取钱
    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount <= balance){
            balance -= amount;
        }else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    public double getBalance(){
        return balance;
    }

    public int getNumber(){
        return number;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main() {
        Book book = new Book("钢铁是怎样炼成的","尼古拉·奥斯特洛夫斯基",new BigDecimal(19.00));
    }
}
