package com.zhangyue.study.extend.demo01;

public class SmartPhone extends Phone{

    private String OS;

    public SmartPhone(String brand, String price,String OS) {
        super(brand, price);
        this.OS = OS;
    }

    @Override
    public void cell(){
        super.cell();
        System.out.println("正在开启视频通话");
    }


    public void showDetails() {
        // 这里的 brand 其实是从父类继承来的
        System.out.println("品牌：" + this.brand + "，系统：" + this.OS);
    }


    public static void main(String [] args) {
        Phone nokia = new Phone("NOKIA", "5000");
        nokia.cell();
        String price1 = nokia.price;
        System.out.println(price1);
        SmartPhone smartPhone = new SmartPhone("小米", "2000", "hyperOS");
        smartPhone.showDetails();
        smartPhone.cell();

    }


}
