package com.zhangyue.study.extend.demo01;

public  class Phone {

    public String brand;

    public String price;


    public Phone(String brand, String price) {
        this.price = price;
        this.brand = brand;
    }

    public void cell(){
        System.out.println("正在使用语音通话");
    }

}
