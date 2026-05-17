package com.zhangyue.study.base.extend;

public class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }

    @Override
    public void sleep(){
        System.out.println("狗在睡觉");
    }

    public void bark(){
        System.out.println("狗在汪汪叫！！！");
    }

    public Dog(String name){
        super(name);
    }

    @Override
    public void hibernation() {
        System.out.println("狗不需要冬眠");
    }
}
