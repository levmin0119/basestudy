package com.zhangyue.study.Polymorphism;

public  class Income {
    public double income;

    public Income(double income){
        this.income = income;
    }

    public double getTax(){
        return income * 0.1;
    }
}
