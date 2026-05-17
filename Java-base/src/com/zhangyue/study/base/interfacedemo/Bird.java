package com.zhangyue.study.base.interfacedemo;

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("鸟会飞");
    }
}
