package com.zhangyue.study.base;

public class StudentDemo {

    private String name;

    private String sex;

    private int age;

    private static int studentTotal;

    public StudentDemo(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;

        studentTotal++;
    }

    public static void main(String[] args) {
//        StudentDemo s1 = new StudentDemo("张钺", "男", 29);
//        StudentDemo s2 = new StudentDemo("李金芳", "女", 29);
//        StudentDemo s3 = new StudentDemo("Tom", "男", 29);
        System.out.println(StudentDemo.studentTotal);
        String name = "zhangyue";

    }
}
