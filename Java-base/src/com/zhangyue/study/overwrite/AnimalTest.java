package com.zhangyue.study.overwrite;

public class AnimalTest {

    public static void main(String[] args){
//        Animal dog = new Dog();
//        Animal animal = new Animal();
//
//        if (dog instanceof Cat){
//            Cat cat = (Cat) animal;
//            cat.move();
//        }else {
//            System.out.println("这部是一只猫");
//        }

//        Cat cat = new Cat();
//        if (cat instanceof Animal){
//            System.out.println("猫属于动物");
//        }else {
//            System.out.println("猫不是动物");
//        }
//        show(new Cat());
//        show(new Dog());
//
//        Animal cat = new Cat();
//        cat.eat();
//        Cat c = (Cat) cat;
//        c.move();


        int x = 1;
        while(x < 3){
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if(x == 3){
            System.out.print("Do");
        }

    }

    public static void show(Animal animal){
        //在Dog类中执行了super方法执行了他的父类方法
        animal.move();
        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.eat();
        }
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.eat();
        }
    }
}
