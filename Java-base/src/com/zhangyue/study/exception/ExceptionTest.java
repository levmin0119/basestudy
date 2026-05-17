package com.zhangyue.study.exception;

import java.io.*;
import java.util.Scanner;

public class ExceptionTest {

    public static void main(String[] args) {
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader("aaa.txt"))){
            while ((line = br.readLine()) != null){
                System.out.println("Line => " + line);
            }
        }catch (IOException e){
            System.out.println("IOException in try block =>" + e.getMessage());
        }

        ExceptionTest exceptionTest = new ExceptionTest();
        exceptionTest.tryWithResourceTest();
    }


    void tryWithResourceTest(){
        try (Scanner sc =new Scanner(new File("/Users/zhangyue/IdeaProjects/zhangyue-study/Java-base/aaa.txt"));
        PrintWriter pr = new PrintWriter(new File("/Users/zhangyue/IdeaProjects/zhangyue-study/Java-base/bbb.txt"))){
            while (sc.hasNext()){
                pr.write(sc.nextLine());
            }
        }catch (IOException e){
            System.out.println("Close resource =>" + e.getMessage());
        }
    }
}
