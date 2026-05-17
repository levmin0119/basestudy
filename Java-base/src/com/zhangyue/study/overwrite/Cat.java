package com.zhangyue.study.overwrite;

public class Cat extends Animal{
    @Override
    public void move() {

        System.out.println("猫会走猫步");

    }

    @Override
    void eat() {
        System.out.println("猫吃鱼");
    }
}
