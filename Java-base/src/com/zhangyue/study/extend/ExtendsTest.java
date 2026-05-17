package com.zhangyue.study.extend;



public class ExtendsTest {

    public static void main(String [] args){
        new Father("zhang","zhangmingguang","man","Programmer");

        Son son = new Son("zhang", "zhangyue", "man", "Programmer");
        son.setHobby("play basketball");
        Daughter daughter = new Daughter("zhang", "zhanganni", "Female", "Student");
        System.out.println(son.likeHobby());
        System.out.println(daughter.toString());


    }

}
