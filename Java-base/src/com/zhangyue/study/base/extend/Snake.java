package com.zhangyue.study.base.extend;

public class Snake extends Animal{
    @Override
    public void hibernation() {
        System.out.println("蛇需要冬眠");
    }

    public Snake(String name){
        super(name);
    }
}
