package com.zhangyue.study.base.interfacedemo;

public class Dack implements Flyable ,Swimable{
    @Override
    public void fly() {
        System.out.println("鸭子会飞");
    }

    @Override
    public void swim() {
        System.out.println("鸭子会游泳");
    }
}
