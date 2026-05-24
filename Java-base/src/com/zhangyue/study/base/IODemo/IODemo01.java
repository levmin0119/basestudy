package com.zhangyue.study.base.IODemo;

import java.io.*;

public class IODemo01 {

    public static void main(String[] args){
        //从控制台读取一个字符
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int read01 = br.read();
            char read = (char)br.read();
            String readLine = br.readLine();
//            System.out.println(read);
//            System.out.println(read01);
//            System.out.println(readLine);
            int b;
            b = 'A';
            System.out.write(b);
            System.out.write('\n');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
