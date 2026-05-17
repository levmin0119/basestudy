package com.zhangyue.study.designmodel;


/**
 * 模版设计方法
 * 父类编写算法结构代码
 * 子类实现具体代码逻辑细节
 */
public class TemplateMethod {

    public final void print(String message){
        System.out.println("#############");
        warpPrint(message);
        System.out.println("#############");
    }

    protected void warpPrint(String message){
    }

    public static void main(String[] args) {
        TemplateMethod templateMethod =  new TemplateMethod(){
            @Override
            protected void warpPrint(String message){
                System.out.println("***"+message+"***");
            }
        };
        templateMethod.print("Hello Thread");

        TemplateMethod templateMethod1 = new TemplateMethod(){
            @Override
            protected void warpPrint(String message){
                System.out.println("---"+message+"---");
            }
        };
        templateMethod.print("Hello Thread");

    }
}
