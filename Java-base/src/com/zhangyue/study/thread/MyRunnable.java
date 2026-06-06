package com.zhangyue.study.thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        this.method01("Hello Thread");
    }


    public void method01(String str){
        for (int i = 0; i<10;i++ ){
            System.out.println("线程执行的方法："+str);
        }
    }

    public static void main(String[] args){
        Thread thread = new Thread(new MyRunnable());
        System.out.println(thread.getName());
        thread.start();
        MyRunnable myRunnable = new MyRunnable();
    }
}
