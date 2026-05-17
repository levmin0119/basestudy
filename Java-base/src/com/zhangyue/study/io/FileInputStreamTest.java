package com.zhangyue.study.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream1 = new FileInputStream("/Users/zhangyue/Downloads/syuhei-inoue-kaoHI0iHJPM-unsplash.jpg");

        int read ;
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/zhangyue/Downloads/a.jpg");
        do {
            read = fileInputStream1.read();
            fileOutputStream.write(read);
        }while (read != -1);


        File file = new File("/Users/zhangyue/Desktop/aaaaa");
        boolean exists = file.exists();
        if (exists){
            System.out.println("文件夹已经存在");
        }else {
            file.mkdir();
            file.delete();
        }


    }
}
