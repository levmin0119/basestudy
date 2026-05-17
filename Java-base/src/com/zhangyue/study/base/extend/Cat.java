package com.zhangyue.study.base.extend;

public class Cat extends Animal{

    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep(){
        System.out.println("猫在睡觉");
    }

    public void meow(){
        System.out.println("猫在喵喵叫");
    }

    public Cat(String name){
        super(name);
    }

    @Override
    public void hibernation() {
        System.out.println("猫咪不需要冬眠");
    }
}
