package com.zhangyue.study.base.extend;

public abstract class Animal {
    private String name;

    public  void  eat(){
        System.out.println("动物在吃饭");
    }

    public void sleep(){
        System.out.println("动物在睡觉");
    }

    public Animal(String name){
        this.name = name;
    }

    public abstract void hibernation();
}
