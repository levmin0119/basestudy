package com.zhangyue.study.base.IODemo;


import java.io.*;

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
        charsetFile("aaa.txt");
        fileInputStream001("aaa.txt");
    }

    public static void charsetFile(String filePath) throws IOException {
        File file = new File(filePath);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter br = new OutputStreamWriter(fileOutputStream,"UTF-8");
        br.append("中文输入");
        br.append("\r\n");
        br.append("English");
        br.close();
        fileOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(fileInputStream, "UTF-8");
        StringBuffer stringBuffer = new StringBuffer();
        while (reader.ready()){
            stringBuffer.append((char) reader.read());
        }
        System.out.println(stringBuffer.toString());
        reader.close();
        fileOutputStream.close();
    }

    public static void fileInputStream001(String filePath)  {
        FileInputStream fis = null;
        BufferedInputStream br = null;
        try{
            fis = new FileInputStream(filePath);
            br = new BufferedInputStream(fis);
            int read = fis.read();
            long begin = System.currentTimeMillis();
            System.out.println("开始时间="+begin);
            if (read != -1){
                System.out.println((char) read);
            }
            System.out.println("耗时="+(System.currentTimeMillis() - begin));
            long start = System.currentTimeMillis();
            int read1 = br.read();
            System.out.println("开始时间="+start);
            if (read1!=-1){
                System.out.println((char) read1);
            }
            System.out.println("缓冲区耗时="+(System.currentTimeMillis() - start));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (br!=null){
                    br.close();
                }
                if (fis!=null){
                    fis.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
