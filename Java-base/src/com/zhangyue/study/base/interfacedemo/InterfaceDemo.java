package com.zhangyue.study.base.interfacedemo;


public class InterfaceDemo {
    public static void main(String[] args){
        Flyable flyable = new Bird();
        flyable.fly();
        Swimable swimable = new Fish();
        swimable.swim();
        Dack dack = new Dack();
        dack.fly();
        dack.swim();
    }
}
