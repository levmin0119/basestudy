package com.zhangyue.study.overloding;

public class OverLoadingTest {

    private String name;

    private String sex;


    /**
     * 方法重载  方法名相同个，参数列表，参数个数，参数类型不同，（参数个数，参数类型相同的时候需要保证参数的顺序不同）
     */
    public OverLoadingTest() {
    }

    public OverLoadingTest(String sex, String name) {
        this.sex = sex;
        this.name = name;
    }

    public OverLoadingTest(int a,String b){
        System.out.println(a);
    }


    public OverLoadingTest(String b,int a){
        System.out.println(b);
    }

}
