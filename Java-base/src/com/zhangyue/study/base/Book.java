package com.zhangyue.study.base;

import java.math.BigDecimal;

public class Book {

    /**
     * 书名
     */
    private String bookName;
    /**
     * 作者
     */
    private String author;
    /**
     * 价格
     */
    private BigDecimal price;

    public Book(String bookName, String author, BigDecimal price){
        this.author = author;
        this.bookName = bookName;
        this.price = price;
    }

    public Book(String bookName){
        this.bookName = bookName;
    }

    public String bookInfo() {
        return "书名：" + this.bookName + "价格：" + this.price;
    }

    public void print(){
        System.out.println(this);
        System.out.println(this.bookName);
    }

    public static void main(String[] args) {
        Book book1 = new Book("钢铁是怎样炼成的","尼古拉·奥斯特洛夫斯基",BigDecimal.valueOf(19.00));
        String bookInfo = book1.bookInfo();
        System.out.println(bookInfo);

        Book book2 = new Book("小王子");
        book1.print();
        System.out.println("========");
        book2.print();
    }
}
