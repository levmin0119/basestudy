package com.zhangyue.study.base.IODemo;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {
        byte[] bwrite = {11,22,33,3,10,5};
        FileOutputStream out = new FileOutputStream("test.txt");
        for(int i = 0; i <bwrite.length; i++){
            out.write(bwrite[i]);
        }
        out.close();

        FileInputStream in = new FileInputStream("test.txt");
        int size = in.available();
        for (int j = 0; j < size; j++) {
            System.out.println((char)in.read()+" ");
        }
        in.close();
    }

}
