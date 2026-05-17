package com.zhangyue.study.base.extend;

import java.util.ArrayList;
import java.util.List;

public class ExtendDemo {

    public static void main(String[] args) {
        Dog dog = new Dog("富贵");
        dog.bark();
        dog.eat();
        Cat cat = new Cat("建国");
        cat.meow();
        cat.eat();

        //多态叫做 父类引用子类对象，创建一个子类对象，将子类对象的内存地址赋值给父类引用
        //向上转型
        Animal animal1 = new Dog("旺财");
        animal1.eat();
        Animal animal2 = new Cat("建国");
        animal2.eat();
        animal2.hibernation();
        animal1.hibernation();

        Snake snake = new Snake("小白");
        snake.hibernation();

        List<Integer> list = new ArrayList<>(3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
