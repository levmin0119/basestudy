package com.zhangyue.study.overwrite;

public class Dog extends Animal {


    /**
     * 重写保证方法名，方法参数，参数列表，参数类型，参数的顺序都要保证一致
     */
    @Override
    public void move() {
        super.move();
        System.out.println("Dog可以移动");
    }

    @Override
    void eat() {

        System.out.println("小狗吃骨头");
    }

//    public void bark(){
//        System.out.println("Dog可以叫");
//    }


    public static void main(String[] args) {
        //多态：名义上引用的是Animal这个对象，实际使用的是Dog这个实例
//        Animal dog = new Dog();
//        Animal animal = new Animal();
//        dog.move();
//        animal.move();
//        Dog dog1 = new Dog();
//        dog1.bark();
    }
}
