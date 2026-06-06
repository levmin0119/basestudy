package com.zhangyue.study.thread;

public class MyThread extends Thread{

    private static  int count;

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        MyThread myThread1  = new MyThread();
        myThread1.start();
        //这里使用join的原因
        //因为我们最终要等哎两个线程计算完count后才返回最终的count的值，如果不使用join住线程（main）有可能直接返回count的值，所以要时刻记住程序中的线程数 = 创建的线程数+1（main线程）
//        myThread.join();
//        myThread.join();
        System.out.println(count);
    }

    @Override
    public    void run(){
        for (int i = 0 ;i<1000; i++) {
            count++;
        }
    }
}

