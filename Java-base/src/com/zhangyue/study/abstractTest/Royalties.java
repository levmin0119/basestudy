package com.zhangyue.study.abstractTest;

public class Royalties extends TaxCalculation{
    @Override
    public double calculationTax(double money) {
        if (money <= 6000){
            return 0;
        }
        return (money - 6000) * 0.01;
    }
}
