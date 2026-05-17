package com.zhangyue.study.Polymorphism;

public class MainTest {

    /**
     * 多态的特性，在运行期间才知道调用那个实例对象的那个方法
     * @param args
     */
    public static void main(String[] args){
        Income[] incomes = new Income[]{
                new Income(3000),
                new Salary(7500),
        new StateCouncilSpecialAllowance(15000)};
        double total = totalTax(incomes);
        System.out.println(total);


    }

    public static double totalTax(Income... incomes){
        double total = 0;
        for (Income income: incomes){
            total = total + income.getTax();
        }
        return total;
    }
}
