package com.zhangyue.study.exception;

public class BankDemo {

    public static void main(String [] args){
        CheckingAccount checkingAccount = new CheckingAccount(100);
        System.out.println("当前银行里有$" + checkingAccount.getBalance());
        //存入
        checkingAccount.deposit(200);
        System.out.println("向银行中存了$200,目前金额$" + checkingAccount.getBalance());
        try {
            checkingAccount.withdraw(150);
            System.out.println("余额$" + checkingAccount.getBalance());
            checkingAccount.withdraw(151);
            System.out.println("余额$" + checkingAccount.getBalance());
        }catch (InsufficientFundsException e){
            System.out.println("抱歉余额不足，还差$" + e.getAmount());
            e.printStackTrace();
        }
    }
}
