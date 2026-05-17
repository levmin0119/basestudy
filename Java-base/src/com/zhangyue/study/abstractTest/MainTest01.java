package com.zhangyue.study.abstractTest;

public class MainTest01 {

    public static void main(String[] args){
        TaxCalculation taxCalculation = new Royalties();
        double v = taxCalculation.calculationTax(7500);
        TaxCalculation salary = new Salary();
        double v1 = salary.calculationTax(6000);
        System.out.println(v);
        System.out.println(v1);
        System.out.println(v+v1);



    }
}
