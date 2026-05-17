package com.zhangyue.study.base;

public class StackDemo {

    public static void main(String[] args) {
        a();
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        int num = 10;
        System.out.println(num);
    }
}
