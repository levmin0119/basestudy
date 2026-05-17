package com.zhangyue.study.abstractTest;

public class Salary extends TaxCalculation{

    @Override
    public double calculationTax(double money) {
        if (money <=5000){
            return 0;
        }
        return money * 0.1;
    }
}
