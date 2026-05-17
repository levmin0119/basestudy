package com.zhangyue.study.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadChar {
    public static void main(String[] args) throws IOException {
        System.out.println("aaa");
        char c;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        do {
            c = (char) bufferedReader.read();
            System.out.println(c);
        } while (c != 'q');


        String str;
        do {
            str = bufferedReader.readLine();
            System.out.println(str);
        }while (!str.equals("end"));

        int b;
        b= 'a';
        System.out.write(b);
        System.out.write('\n');

        FileInputStream fileInputStream = new FileInputStream("");
    }
}
